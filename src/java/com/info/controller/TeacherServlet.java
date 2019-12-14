/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.info.controller;

import com.info.dao.TeacherDao;
import com.info.model.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bvek
 */
@WebServlet(name = "Teacher", urlPatterns = {"/Teacher"})
public class TeacherServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            if(request.getParameter("AddTeacher")!=null && request.getParameter("AddTeacher").equals("Add")){
                String teacherName= request.getParameter("teacherName");
                String faculty=request.getParameter("Faculty");
                String address=request.getParameter("Address");
                Teacher teacher=new Teacher();
                teacher.setTeacherName(teacherName);
                teacher.setFaculty(faculty);
                teacher.setAddress(address);
                TeacherDao td=new TeacherDao();
                td.insertTeacher(teacher);
                List<Teacher> teacherList = td.getTeacherList();
                request.setAttribute("teacherList", teacherList);
                RequestDispatcher rd = request.getRequestDispatcher("teacherList.jsp");
                rd.forward(request, response);
            }else if (request.getParameter("TeacherIdForEdit")!= null) {
                String teacher_Id = request.getParameter("TeacherIdForEdit");
                TeacherDao td=new TeacherDao();
                Teacher Teacher=td.getTeacher(Integer.parseInt(teacher_Id));
                request.setAttribute("Teacher", Teacher);
                RequestDispatcher rd = request.getRequestDispatcher("TeacherForm.jsp");
                rd.forward(request, response);

            }else if (request.getParameter("UpdateTeacher")!= null && request.getParameter("UpdateTeacher").equals("Update")) {

                String teacher_Id = request.getParameter("teacher_Id");
                String teacherName= request.getParameter("teacherName");
                String faculty=request.getParameter("Faculty");
                String address=request.getParameter("Address");

               	Teacher teacher=new Teacher();
                teacher.setTeacher_Id(Integer.parseInt(teacher_Id));
                teacher.setTeacherName(teacherName);
                teacher.setFaculty(faculty);
                teacher.setAddress(address);
                TeacherDao td = new TeacherDao();
                td.updateTeacher(teacher);
                List<Teacher> teacherList = td.getTeacherList();
                request.setAttribute("teacherList", teacherList);
                RequestDispatcher rd = request.getRequestDispatcher("teacherList.jsp");
                rd.forward(request, response);
            }

             
         
            
                
                
                  
                             
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

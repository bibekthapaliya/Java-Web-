/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info.controller;

import com.info.dao.StudentDao;
import com.info.dao.TeacherDao;
import com.info.model.Student;
import com.info.model.Teacher;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bvek
 */
public class StudentServlet extends HttpServlet {
    
   

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
            /* TODO output your page here. You may use following sample code. */
            
            if(request.getParameter("NewStudent")!=null){
                RequestDispatcher rd = request.getRequestDispatcher("StudentForm.jsp");
                rd.forward(request, response);
            
            } else if (request.getParameter("Teacher")!= null) {

                TeacherDao td=new TeacherDao();
                List<Teacher> teacherList = td.getTeacherList();
                request.setAttribute("teacherList", teacherList);
                RequestDispatcher rd = request.getRequestDispatcher("teacherList.jsp");
                rd.forward(request, response);
            }
            
            else if (request.getParameter("Student")!= null) {

                StudentDao sd = new StudentDao();
                
                List<Student>studentList = sd.getStudentList();
                request.setAttribute("studentList", studentList);
                RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
                rd.forward(request, response);

            } else if (request.getParameter("StudentIdForDelete") != null) {
                String StudentId = request.getParameter("StudentIdForDelete");

                StudentDao sd = new StudentDao();
                sd.deleteStudent(Integer.parseInt(StudentId));

                List<Student> studentList = sd.getStudentList();
                request.setAttribute("studentList", studentList);
                RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
                rd.forward(request, response);

            } else if (request.getParameter("StudentIdForEdit") != null) {
                 System.out.println(">>>>>>Entered Here<<<<<");

                String StudentId = request.getParameter("StudentIdForEdit");
                StudentDao sd = new StudentDao();
                Student Student = sd.getStudent(Integer.parseInt(StudentId));
                request.setAttribute("Student", Student);
                RequestDispatcher rd = request.getRequestDispatcher("StudentForm.jsp");
                rd.forward(request, response);

            }
            else if (request.getParameter("SearchValue") != null) {
                
                
                String StudentName = request.getParameter("SearchValue");
                StudentDao sd = new StudentDao();
                List<Student> studentList=sd.searchStudent(StudentName);
                 request.setAttribute("studentList", studentList);
                 RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
                rd.forward(request, response);
            }
            else if (request.getParameter("AddStudent") != null && request.getParameter("AddStudent").equals("Add")){
                
                String StudentName = request.getParameter("StudentName");
                String StudentAddress = request.getParameter("StudentAddress");
                       
                Student student = new Student();
                student.setStudentName(StudentName);
                student.setStudentAddress(StudentAddress);
                StudentDao sd = new StudentDao();
                sd.insertStudent(student);

                List<Student> studentList = sd.getStudentList();
                request.setAttribute("studentList", studentList);
                RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
                rd.forward(request, response);
            } else if (request.getParameter("UpdateStudent") != null && request.getParameter("UpdateStudent").equals("Update")) {

                String StudentId = request.getParameter("StudentId");
                String StudentName = request.getParameter("StudentName");
                String StudentAddress = request.getParameter("StudentAddress");
                Student student = new Student();
                student.setStudentId(Integer.parseInt(StudentId));
                student.setStudentName(StudentName);
                student.setStudentAddress(StudentAddress);
                StudentDao sd = new StudentDao();
                sd.updateStudent(student);
                List<Student> studentList = sd.getStudentList();
                request.setAttribute("studentList", studentList);
                RequestDispatcher rd = request.getRequestDispatcher("StudentList.jsp");
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.info.dao;

import com.info.model.Teacher;
import com.info.other.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bvek
 */
public class TeacherDao {
    
    public void insertTeacher(Teacher teacher){
    
    try{
        
 
    Connection con= DbConnection.getDbConnection();
    String qry="insert into teacher(teacherName, faculty, address)value(?,?,?)";
    PreparedStatement pset=con.prepareStatement(qry);
    pset.setString(1,teacher.getTeacherName());
    pset.setString(2,teacher.getFaculty());
    pset.setString(3,teacher.getAddress());
    pset.execute();
   
    
        }catch(Exception e){
        e.printStackTrace();
    
        }
    
    
    
    }
    public Teacher getTeacher(int teacher_Id)
    {
    try{
    
    Connection con=DbConnection.getDbConnection();
    String qry="select * from teacher where teacher_Id=?";
    PreparedStatement pset=con.prepareStatement(qry);
        pset.setInt(1,teacher_Id);
        ResultSet rs=pset.executeQuery();
        while(rs.next()){
        Teacher teacher=new Teacher();
        teacher.setTeacher_Id(rs.getInt("teacher_Id"));
        teacher.setTeacherName(rs.getString("teacherName"));
        teacher.setFaculty(rs.getString("faculty"));
        teacher.setAddress(rs.getString("address")); 
        return(teacher); 
        
        }
    
    
    }catch(Exception e){
    e.printStackTrace();
    
    }
    
    return null;
    
    }
    public void updateTeacher(Teacher teacher){
    
     try{
        Connection con=DbConnection.getDbConnection();
        String qry="update teacher set teacherName=?,faculty=?,address=? where teacher_Id=?";
         PreparedStatement pset=con.prepareStatement(qry);
        pset.setString(1,teacher.getTeacherName());
        pset.setString(2,teacher.getFaculty());
	pset.setString(3,teacher.getAddress());
        pset.setInt(4,teacher.getTeacher_Id());
        pset.execute();
                  
     }catch(Exception e){
            e.printStackTrace();
     }
    
    }
    
    public List<Teacher> getTeacherList()
    {

    try{
        Connection con=DbConnection.getDbConnection();
        List <Teacher> teacherList=new ArrayList<Teacher>();
        String qry="select * from teacher";
        PreparedStatement pset=con.prepareStatement(qry);
        ResultSet rs=pset.executeQuery();
        while(rs.next()){
        
	Teacher teacher=new Teacher();
        teacher.setTeacher_Id(rs.getInt("teacher_Id"));
        teacher.setTeacherName(rs.getString("teacherName"));
        teacher.setFaculty(rs.getString("faculty"));
        teacher.setAddress(rs.getString("address"));    
        teacherList.add(teacher); 
        }
        return teacherList;
        
        }catch(Exception e){
         
       e.printStackTrace();
        
        }
        return null;
    }
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.info.dao;

import com.info.model.Student;
import com.info.other.DbConnection;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Bvek
 */
public class StudentDao {
    
   InputStream inputStream = null;
    Statement stmt = null;
    
    public void insertStudent(Student student){
        
    
    try{
        
        Connection con=DbConnection.getDbConnection();
        String query="insert into info(StudentName,StudentAddress) value(?,?)";
        
        PreparedStatement pset=con.prepareStatement(query);
        
        pset.setString(1,student.getStudentName());
        pset.setString(2,student.getStudentAddress());
        pset.execute();
        

    }catch(Exception e){
    
    e.printStackTrace();
    }
    
    }
    
    public void deleteStudent(int StudentId){
    try{
        Connection con=DbConnection.getDbConnection();
        String del="delete from info where StudentId=?";
        
        PreparedStatement pset=con.prepareStatement(del);
        pset.setInt(1,StudentId);
        pset.execute();
    
    
    }catch(Exception e){
    e.printStackTrace();
    }
    
    
    }
    public Student getStudent(int StudentId)
    {
    try{
    
    Connection con=DbConnection.getDbConnection();
    String qry="select * from info where StudentId=?";
    PreparedStatement pset=con.prepareStatement(qry);
        pset.setInt(1,StudentId);
        ResultSet rs=pset.executeQuery();
        while(rs.next()){
        Student student=new Student();
        student.setStudentId(rs.getInt("StudentId"));
        student.setStudentName(rs.getString("StudentName"));
         student.setStudentAddress(rs.getString("StudentAddress"));
        
        return(student); 
        
        }
    
    
    }catch(Exception e){
    e.printStackTrace();
    
    }
    
    return null;
    
    }
    public List<Student> searchStudent(String StudentName)
    {
    try{
        System.out.println(StudentName);
    
    Connection con=DbConnection.getDbConnection();
    List<Student> studentList=new ArrayList<Student>();
    String qry="select * from info where StudentName=?";
    PreparedStatement pset=con.prepareStatement(qry);
        pset.setString(1,StudentName);
        ResultSet rs=pset.executeQuery();
        while(rs.next()){
        Student student=new Student();
        student.setStudentId(rs.getInt("StudentId"));
        student.setStudentName(rs.getString("StudentName"));
        student.setStudentAddress(rs.getString("StudentAddress"));
        studentList.add(student); 
        return studentList;
       
        }
        
          
    }catch(Exception e){
    e.printStackTrace();
    
    }
    
    return null;
    
    }
    
    public void updateStudent(Student student){
    
     try{
        Connection con=DbConnection.getDbConnection();
        String qry="update info set StudentName=?,StudentAddress=? where StudentId=?";
         PreparedStatement pset=con.prepareStatement(qry);
        
        pset.setString(1,student.getStudentName());
        pset.setString(2,student.getStudentAddress());
        pset.setInt(3,student.getStudentId());
        pset.execute();
                  
     }catch(Exception e){
            e.printStackTrace();
     }
    
    }
   
    public List<Student> getStudentList()
    {

    try{
        Connection con=DbConnection.getDbConnection();
        List<Student> studentList=new ArrayList<Student>();
       // String sql = "SELECT id, first, last, age FROM Registration" +
        //           " ORDER BY first ASC";
       // String qry="select * from info";
        String qry="select * from info order by StudentName";
        PreparedStatement pset=con.prepareStatement(qry);
       // stmt=con.createStatement();
       ResultSet rs=pset.executeQuery();
        //ResultSet rs=stmt.executeQuery(qry);
        while(rs.next()){
        Student student=new Student();
        student.setStudentId(rs.getInt("StudentId"));
        student.setStudentName(rs.getString("StudentName"));
         student.setStudentAddress(rs.getString("StudentAddress"));
         
        
        studentList.add(student); 
        }
        return studentList;
        
        }catch(Exception e){
         
       e.printStackTrace();
        
        }
        return null;
    }
    
}
    
    
  
    


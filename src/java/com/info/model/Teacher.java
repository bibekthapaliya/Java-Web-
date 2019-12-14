/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.info.model;

/**
 *
 * @author Bvek
 */
public class Teacher {
    private String teacherName;
    private String faculty;
    private String address;
    private int teacher_Id;

    /**
     * @return the teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @return the faculty
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * @param faculty the faculty to set
     */
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the teacher_Id
     */
    public int getTeacher_Id() {
        return teacher_Id;
    }

    /**
     * @param teacher_Id the teacher_Id to set
     */
    public void setTeacher_Id(int teacher_Id) {
        this.teacher_Id = teacher_Id;
    }
    
    
    
}

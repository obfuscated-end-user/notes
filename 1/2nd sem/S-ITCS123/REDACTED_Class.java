package com.mycompany.redacted_class;

public class REDACTED_Class {

    public static void main(String[] args) {
        System.exit(0);
    }
}

class Student {
    
    private int studentNo;
    private String fname, lname, course;
    
    // constructor
    public Student() {
        studentNo = 0;
        fname = null;
        lname = null;
        course = null;
    }
    
    // mutator methods
    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    
    // accessor methods
    public int getStudentNo() {
        return studentNo;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getCourse() {
        return course;
    }  
}

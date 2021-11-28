package com.lijiazhen.mybatisdemo.po;

public class Student {
    private Integer studentid;
    private String studentname;
    private String studentage;
    private String studentgender;

    public Integer getStudentid() {
        return studentid;
    }

    public String getStudentgender() {
        return studentgender;
    }

    public void setStudentgender(String studentgender) {
        this.studentgender = studentgender;
    }

    public String getStudentage() {
        return studentage;
    }

    public void setStudentage(String studentage) {
        this.studentage = studentage;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }
}


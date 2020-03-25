package com.pojo;

public class Student {
    private Integer sid;

    private String sname;

    public Integer getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}
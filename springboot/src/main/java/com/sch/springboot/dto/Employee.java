package com.sch.springboot.dto;

public class Employee {
    private String sno;
    private String name;
    private String department;

    public String getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

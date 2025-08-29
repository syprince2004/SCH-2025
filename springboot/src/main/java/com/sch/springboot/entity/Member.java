package com.sch.springboot.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    private int sno;
    private String name;
    private String address;
    private String department;
    private LocalDateTime mdate;

    public int getSno() {
        return sno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDateTime getMdate() {
        return mdate;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMdate(LocalDateTime mdate) {
        this.mdate = mdate;
    }
}

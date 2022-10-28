package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logs")
public class LogModel {
    @Id
    @GeneratedValue
    public int id;
    public int empcode;
    public String checkIn;
    public String checkOut;
    public String inDate;
    public String outDate;
    public LogModel() {
    }

    public LogModel(int id, int empcode, String checkIn, String checkOut, String inDate, String outDate) {
        this.id = id;
        this.empcode = empcode;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.inDate = inDate;
        this.outDate = outDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }
}

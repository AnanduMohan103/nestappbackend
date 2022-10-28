package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security")
public class SecurityModel {
    @Id
    @GeneratedValue
    private int id;
    private String sCode;
    private String sName;
    private String sPhone;
    private String sDate;
    private String sUsername;
    private String sPassword;

    public SecurityModel() {
    }

    public SecurityModel(int id, String sCode, String sName, String sPhone, String sDate, String sUsername, String sPassword) {
        this.id = id;
        this.sCode = sCode;
        this.sName = sName;
        this.sPhone = sPhone;
        this.sDate = sDate;
        this.sUsername = sUsername;
        this.sPassword = sPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getsDate() {
        return sDate;
    }

    public void setsDate(String sDate) {
        this.sDate = sDate;
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername;
    }

    public String getsPassword() {
        return sPassword;
    }

    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }
}

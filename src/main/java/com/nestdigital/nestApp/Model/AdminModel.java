package com.nestdigital.nestApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmpAdd")
public class AdminModel {
    @Id
    @GeneratedValue
    private int id;
    private int empcode;
    private String name;
    private String address;
    private  String email;
    private  String dob;
    private String phone;
    private  String username;
    private  String password;
    private String jod;

    public AdminModel() {
    }

    public AdminModel(int id, int empcode, String name, String address, String email, String dob, String phone, String username, String password, String jod) {
        this.id = id;
        this.empcode = empcode;
        this.name = name;
        this.address = address;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.jod = jod;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJod() {
        return jod;
    }

    public void setJod(String jod) {
        this.jod = jod;
    }
}

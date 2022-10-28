package com.nestdigital.nestApp.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leaves")
public class LeaveModel {
    @Id
    @GeneratedValue
    public int id;
    public int empcode;
    public String type;
    public String discrip;
    public String applyDate;
    public String leaveDate;
    public int status;

    public LeaveModel() {
    }

    public LeaveModel(int id, int empcode, String type, String discrip, String applyDate, String leaveDate, int status) {
        this.id = id;
        this.empcode = empcode;
        this.type = type;
        this.discrip = discrip;
        this.applyDate = applyDate;
        this.leaveDate = leaveDate;
        this.status = status;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiscrip() {
        return discrip;
    }

    public void setDiscrip(String discrip) {
        this.discrip = discrip;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

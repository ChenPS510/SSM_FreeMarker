package com.cps.www.entity;

import java.io.Serializable;

public class Admin implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Integer adminId;
    private String adminName;
    private String adminPassword;

    public Admin() {
        super();
    }

    public Admin(Integer adminId, String adminName, String adminPassword) {
        super();
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public Integer getAdminId() {
        return this.adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return this.adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword + "]";
    }

}

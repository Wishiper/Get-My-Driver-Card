package com.example.nekr0s.get_my_driver_card.models;

import java.io.Serializable;

public class Role implements Serializable {
    private int roleId;
    private String role;

    public Role() {
        // keep empty
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

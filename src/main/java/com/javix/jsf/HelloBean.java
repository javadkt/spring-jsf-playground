package com.javix.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String selectedDepartment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelectedDepartment() {
        return selectedDepartment;
    }

    public void setSelectedDepartment(String selectedDepartment) {
        this.selectedDepartment = selectedDepartment;
    }

    public void printSelectedDepartment() {
        // You can access the selectedDepartment property here
        System.out.println("Selected Department: " + selectedDepartment);
    }

}
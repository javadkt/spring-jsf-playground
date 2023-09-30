package com.javix.jsf;

import com.javix.jsf.model.Department;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private int departmentId;

    private String selectedDepartment;

    private String selectedDepartmentBacked;

    private List<Department> departments;


    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId; // Add this setter method
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelectedDepartment() {
        return selectedDepartment;
    }

    public String getSelectedDepartmentBacked() {
        return selectedDepartmentBacked;
    }

    public void setSelectedDepartment(String selectedDepartment) {
        this.selectedDepartment = selectedDepartment;
    }

    public void printSelectedDepartment() {
        // You can access the selectedDepartment property here
        System.out.println("Selected Department(Frontend): " + selectedDepartment);
        System.out.println("Selected Department(Backend): " + departmentId); // to get the department object instead of ID you need to use converters or InitBinder(in JSP)
    }

    public List<Department> getDepartments() {
        departments = new ArrayList<>();
        departments.add(new Department(1, "HR"));
        departments.add(new Department(2, "IT"));
        departments.add(new Department(3, "FINANCE"));
        return departments;
    }

}
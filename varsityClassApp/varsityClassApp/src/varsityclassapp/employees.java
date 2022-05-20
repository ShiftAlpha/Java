/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varsityclassapp;

/**
 *
 * @author 16012775
 */
public class employees {
    
   protected int staffID;
   protected String name;
   protected String surname;
   protected String skills;
   protected String address;

    public employees(int staffID, String name, String surname, String skills, String address) {
        this.staffID = staffID;
        this.name = name;
        this.surname = surname;
        this.skills = skills;
        this.address = address;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSkills() {
        return skills;
    }

    public String getAddress() {
        return address;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "employees: " + "staffID: " + staffID + ", name: " + name + ", surname: " + surname + ", skills: " + skills + ", address: " + address;
    }
    

    
   
    

    
   
   
   
   
}

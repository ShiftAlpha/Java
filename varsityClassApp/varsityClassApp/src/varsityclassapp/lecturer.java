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
public class lecturer extends employees{
    
    private String coursess;
    private int marking;
    private String research;
    private static double salary;

    public lecturer(String coursess, int marking, String research, double salary, int staffID, String name, String surname, String skills, String address) {
        super(staffID, name, surname, skills, address);
        this.coursess = coursess;
        this.marking = marking;
        this.research = research;
        this.salary = salary;
    }

    public String getCoursess() {
        return coursess;
    }

    public int getMarking() {
        return marking;
    }

    public String getResearch() {
        return research;
    }

    public double getSalary() {
        return salary;
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

    public void setCoursess(String coursess) {
        this.coursess = coursess;
    }

    public void setMarking(int marking) {
        this.marking = marking;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        return "lecturer: " + "coursess: " + coursess + ", marking: " + marking + ", research: " + research + ", salary: " + salary ;
    }
    
    public static double calcSalary(double percOfDays){
        double average = (percOfDays/100) *salary;
        
        return average;
    }
    
    
    
    
    
    
    
}

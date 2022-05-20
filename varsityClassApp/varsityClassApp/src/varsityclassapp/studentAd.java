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
public class studentAd extends employees{
    
    private String schools;
    private double baseSalary;
    private double commission;
    private int saleTarget;

    public studentAd(String schools, double baseSalary, double commission, int saleTarget, int staffID, String name, String surname, String skills, String address) {
        super(staffID, name, surname, skills, address);
        this.schools = schools;
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.saleTarget = saleTarget;
    }

    public String getSchools() {
        return schools;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getCommission() {
        return commission;
    }

    public int getSaleTarget() {
        return saleTarget;
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

    public void setSchools(String schools) {
        this.schools = schools;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setSaleTarget(int saleTarget) {
        this.saleTarget = saleTarget;
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
        return "studentAd: " + "schools: " + schools + ", baseSalary: " + baseSalary + ", commission: " + commission+", saleTarget: " + saleTarget;
    }
    
    
    
}

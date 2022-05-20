
package varsitycollegeapp;


public abstract class Employee {
    
    protected int staffID;
    protected String name;
    protected String surname;
    protected String skills;
    protected String address;
    

    public Employee(int staffID, String name, String surname, String skills, String address) {
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

    
    public String displayDetails(){
    
        return this.staffID + " : " + this.name + " " + this.surname + " with skills in " + this.skills + " who stays at " + this.address;
        
    }
    
    
    abstract double getCalculatedSalary();
    
    
    
}

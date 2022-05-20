
package varsitycollegeapp;

import javax.swing.JOptionPane;


public class StudentAdvisor extends Employee{
    
    private String schools;
    private static double basicSalary;
    private static double commission;
    private int salesTarget;
    private double percOfDays;     
    

    public StudentAdvisor(String schools, double basicSalary, double commission, int salesTarget, int staffID, String name, String surname, String skills, String address) {
        super(staffID, name, surname, skills, address);
        this.schools = schools;
        this.basicSalary = basicSalary;
        this.commission = commission;
        this.salesTarget = salesTarget;
    }
    
    

    public String getSchools() {
        return schools;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getCommission() {
        return commission;
    }

    public int getSalesTarget() {
        return salesTarget;
    }
    
    
    

    public void setSchools(String schools) {
        this.schools = schools;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public void setSalesTarget(int salesTarget) {
        this.salesTarget = salesTarget;
    }
    
    

//    @Override
//    public String toString() {
//        return "StudentAdvisor - " + "Schools:" + schools + " | Basic Salary:" + basicSalary + " | Commission:" 
//                + commission + " | Sales Target:" + salesTarget +  " | Staff ID:" + staffID + " | Name:" + name + 
//                " | Surname:" + surname + " | Skill:" + skills + " | Address:" + address;
//    }
    
    
    
   @Override
    public String displayDetails(){
    
    String s1 = super.displayDetails();
    
    return s1 + " who is a student advisor at " + this.getSchools() + " with a basic salary of " + this.getBasicSalary() + 
            " and commision of " + this.getCommission() + " with a sales target of " + this.getSalesTarget();
        
    }
    
    
    public static double calculateSalary(double percOfDays) {
        
        double total = basicSalary + commission;
        
        double average = (percOfDays / 100) * total;

        return average;

    }

    @Override
    public double getCalculatedSalary() {
        
        double val =0;
        val = Double.parseDouble(JOptionPane.showInputDialog("Gimme your sheep"));
        
        double total = basicSalary + commission;
        
        double average = (percOfDays / 100) * total;
       

        return average;
    }
    
    
    
    
    
}

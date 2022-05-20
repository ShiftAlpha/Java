
package varsitycollegeapp;


public class Lecturer extends Employee{

    
   
    private String courses;
    private int marking;
    private String research;
    private double salary;
    private static double percOfDays;
    

    public Lecturer(String courses, int marking, String research, double salary, int staffID, String name, String surname, String skills, String address) {
        super(staffID, name, surname, skills, address);
        this.courses = courses;
        this.marking = marking;
        this.research = research;
        this.salary = salary;
    }
    
    

    public String getCourses() {
        return courses;
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
    
    

    public void setCourses(String courses) {
        this.courses = courses;
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
    
    

    @Override
    public String toString() {
        return "Lecturer - " + "Courses:" + courses + " | Marking:" + marking + " | Research:" + research + " | Salary:" + salary + 
                " | Staff ID:" + staffID + " | Name:" + name + " | Surname:" + surname + " | Skill:" + skills + " | Address:" + address;
        
    }
    
    
//    public String displayDetails() {
//
//       return this.courses + " : " + this.marking + " : " + this.research + " : " + this.salary + " : " + 
//                this.staffID + " : " + this.name + " : " + this.surname + " : " + this.skills  + " : " + 
//                this.address;        
//    }
    
    
    @Override
    public String displayDetails() {

        String s1 = super.displayDetails();

        return s1 + " who lectures " + this.courses + " with marking of " + this.marking + " with research in " + this.research
                + " and a salary of " + this.salary;

    }
    
   
       @Override
    double getCalculatedSalary() {

        double average = (percOfDays / 100) * salary;

        return average;

    }
    
    public boolean equals(Lecturer obj){
        
        boolean result;
        
        if (this.staffID == obj.staffID) {
            result = true;
        }
        
        else {
            result = false;
        }
        
        return result;
    }
     


   
}

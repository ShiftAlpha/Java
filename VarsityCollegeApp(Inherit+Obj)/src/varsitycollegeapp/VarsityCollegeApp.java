
package varsitycollegeapp;


public class VarsityCollegeApp {


    public static void main(String[] args) {
        
        Lecturer lect1 = new Lecturer("IT", 2, "Information", 12000 ,101 , "Ray", "Nak", "IT", "123 Blue Road");
        Lecturer lect2 = new Lecturer("Programming", 10, "Java", 20000, 102, "John", "Blue", "Computer Science", "142 White Road");
        
        StudentAdvisor advisor1 = new StudentAdvisor("VC", 10000, 12000, 10000, 103, "Rayhaan", "Nakooda", "Communications", "123 Blue Road");
        
        
        
        

        System.out.println(lect1.displayDetails());
//        System.out.println("Average salary for lecturer is : " + Lecturer.getCalculatedSalary(10) + "\n");
        System.out.println(lect2.displayDetails());
//        System.out.println("Average salary for lecturer is : " + Lecturer.calculateSalary(13) + "\n");
        
        
        System.out.println(advisor1.displayDetails());
        System.out.println("Average salary for advisor is : "  + StudentAdvisor.calculateSalary(15));
        
      
        System.out.println(lect1.equals(lect2));
        
        
    }
    
}


package usestudent;


public class Student_Report extends Student
{

    public Student_Report(String studentNumber, double testResult, double assignmentResult, double exam) 
    {
        super(studentNumber, testResult, assignmentResult, exam);
    }
    
    
    public void print_report()
    {
        System.out.println("STUDENT REPORT\n\n"
                + "***************************************"
                + "\nSTUDENT NUMBER: " + studentNumber
                + "\nTEST WEIGHTING: " + (testResult*0.25) 
                + "\nASSIGNMENT WEIGHTING: " + (assignmentResult * 0.25) 
                + "\nEXAM WEIGHTING: " + (exam * 0.5) 
                + "\nFINAL RESULT: " + (testResult * 0.25 + assignmentResult * 0.25 + exam * 0.5)+"%"
                + "\n***************************************");
    }
}


package usestudent;


public abstract class Student implements iReport
{
    protected String studentNumber;
    protected double testResult;
    protected double assignmentResult;
    protected double exam;

    public Student(String studentNumber, double testResult, double assignmentResult, double exam) 
    {
        this.studentNumber = studentNumber;
        this.testResult = testResult;
        this.assignmentResult = assignmentResult;
        this.exam = exam;
    }

    public String getStudentNumber() 
    {
        return studentNumber;
    }

    public double getTestResult() 
    {
        return testResult;
    }

    public double getAssignmentResult() 
    {
        return assignmentResult;
    }

    public double getExam() 
    {
        return exam;
    }
    
    
}

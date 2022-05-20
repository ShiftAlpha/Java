/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2018;

import java.text.DecimalFormat;

/**
 *
 * @author 16012775
 */

//abstract class implements Ireport class
public abstract class Student implements iReport {

    //protected variables 
    protected int stuNum;
    protected double testResult;
    protected double assignResult;
    protected double examResult;

    //constructor containing attributes to student
    public Student(int stuNum, double testResult, double assignResult, double examResult) {
        this.stuNum = stuNum;
        this.testResult = testResult;
        this.assignResult = assignResult;
        this.examResult = examResult;
    }

    //get values - 
    //get stu number
    public int getStuNum() {
        return stuNum;
    }
    
    //get test result
    public double getTestResult() {
        return testResult;
    }
    
    //get assignment result
    public double getAssignResult() {
        return assignResult;
    }

    //get exam Result
    public double getExamResult() {
        return examResult;
    }

    //override print report 
    @Override
    //print report printing student details
    public void print_report() {
        
        //decimal format
        DecimalFormat df = new DecimalFormat("#.##");

        //calculate weightings
        double testWeight = getTestResult() / 4;
        double assignWeight = getAssignResult() / 4;
        double examWeight = getExamResult() / 2;

        //calculate final result
        double finalResult = testWeight + examWeight + assignWeight;

        //print detials
        System.out.println("STUDENT REPORT");
        System.out.println("***************************\n");

        System.out.println("STUDENT NUMBER: " + getStuNum()
                + "\nTEST WEIGHTING: " + (df.format(testWeight))
                + "\nASSIGNMENT WEIGHTING: " + (df.format(assignWeight))
                + "\nEXAM WEIGHTING: " + (df.format(examWeight))
                + "\nFINAL RESULT: " + (df.format(finalResult))+"%");
        System.out.println("***************************");
    }
}

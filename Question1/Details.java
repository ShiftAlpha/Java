package Question1;

import javax.swing.JOptionPane;
import sun.security.jca.GetInstance;

/**
 * @author DhiravRana Student Number: 16012775 Question 1 Prog Assignment
 */
//-----------Class----------------------------------------------//
public class Details {

    public String fName;
    public String sName;

    public int eID;

    double originalSalary;
    double updatedSalary;
    double increasedAmount;

    double tax;
    double medical;
    double carAllowance;
    double UIF;

//-----------Constructor---------------------------------------//
    public Details(String fName, String sName, int eID, double originalSalary) {

        this.fName = fName;
        this.sName = sName;
        this.eID = eID;
        this.originalSalary = originalSalary;

    }

//-----------Get Methods--------------------------------------//
    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public int geteID() {
        return eID;
    }

    public double getOriginalSalary() {
        return originalSalary;
    }

    public double getUpdatedSalary() {

        updatedSalary = (originalSalary * 1.1);// 1.1 : (100:110 = 1:1.1)
        return updatedSalary;
    }

//-----------Set Methods--------------------------------------//
    public void setfName(String fNameIn) {
        fName = fNameIn;
    }

    public void setsName(String sNameIn) {
        sName = sNameIn;
    }

    public void seteID(int eIDin) {
        eID = eIDin;
    }
//-----------Deductions--------------------------------------//

    public double tax() {
        tax = getUpdatedSalary() * 0.18;
        return tax;
    }

    public double medical() {
        medical = getUpdatedSalary() * 0.125;
        return medical;
    }

    public double carAllowance() {
        carAllowance = getUpdatedSalary() * 0.008;
        return carAllowance;
    }

    public double UIF() {
        UIF = getUpdatedSalary() * 0.02;
        return UIF;
    }
}

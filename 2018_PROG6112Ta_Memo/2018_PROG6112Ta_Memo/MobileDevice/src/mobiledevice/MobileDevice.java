package mobiledevice;

public class MobileDevice 
{
    static int[][] arrSales = {{30, 15, 35}, {20, 25, 30}, {25, 11, 32}};
    static String[] arrMonths = {"JAN","FEB","MAR"};
    static String[] arrPhones = {"IPhone 7","Samsung S8","Huawei Mate 10"};
    static int [] arrMonthTotals = new int [arrMonths.length];
    
    
    public static void main(String[] args) 
    {
        displayReportHeader();
        System.out.println(displayMonths()+"\t\tTOTAL");
        displaySales();
        displayReportFooter();
    }
    
    public static void displayReportHeader ()
    {
        System.out.println("******************************************************************************"
                + "\nTOP CELL PHONE SALES REPORT - 2018"
                + "\n******************************************************************************");
    }
    
    public static String displayMonths()
    {
       String joinMonth = "";
        for (int i = 0; i < arrMonths.length; i++) 
        {
            joinMonth += "\t\t"+arrMonths[i]; 
        }
        return joinMonth;
    }

    public static void displaySales()
    {
        String joinData = "";
        int total = 0;
        int monthlyTotal = 0;
        
        for (int i = 0; i < arrPhones.length; i++) 
        {
           joinData = arrPhones[i] + "\t"; 
            for (int j = 0; j < arrSales[i].length; j++) 
            {
                joinData += arrSales[i][j] + "\t\t";
                total += arrSales[i][j];
                monthlyTotal += arrSales[j][i];
                
            }
            arrMonthTotals[i] = monthlyTotal;
            joinData += total;
            System.out.println(joinData);
            total = 0;
            monthlyTotal = 0;
        }
        
    }
    
    public static void displayReportFooter()
    {
        String joinMonthlyTotals = "";
        for (int i = 0; i < arrMonthTotals.length; i++) 
        {
            joinMonthlyTotals += arrMonthTotals[i] + "\t\t";
        }
        System.out.println("******************************************************************************"
                + "\nMONTHLY TOTAL"
                + "\t" + joinMonthlyTotals
                + "\n******************************************************************************");
    }
    
}

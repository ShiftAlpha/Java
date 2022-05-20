
package employeesalesreport;


public class EmployeeSalesReport 
{
    static int [][] arrEmpSales = 
    {
        {3000,2000,3500},
        {2500,5500,3500},
        {1100,2000,4500},
        {1700,2700,2500},
        {5000,2900,5900}
    };
    
    static String [] arrEmpNum = 
    {
        "101111",
        "101122",
        "101133",
        "101144",
        "101155"
    };
    
    static double [] arrEmpTotal = new double [arrEmpSales.length];
    
    public static void main(String[] args) 
    {
        displaySalesReportHeading();
        displayColumns();
        displayEmployeeSales();
        displayTotalSalesHeading();
        displayTotalSales();
    }
    
    public static void displaySalesReportHeading()
    {
        System.out.println("**********************************************************"
                + "\nEMPLOYEE SALES REPORT"
                + "\n**********************************************************");
    }
    
    public static void displayColumns()
    {
        String joinCol = "\t\t";
        for (int i = 1; i < arrEmpSales[i].length+1; i++) 
        {
            joinCol += "SALES " + i + "\t\t";
        }
        System.out.println(joinCol);
    }
    
    public static void displayEmployeeSales()
    {
        String joinEmpData = "";
        double accumulate = 0;
        for (int i = 0; i < arrEmpSales.length; i++) 
        {
             
            for (int j = 0; j < arrEmpSales[i].length; j++) 
            {
                joinEmpData += "\t" + "R " + arrEmpSales[i][j] + "\t";
                accumulate += arrEmpSales[i][j];
            }
            System.out.println(arrEmpNum[i]+ "-->" + joinEmpData);
            joinEmpData = "";
            arrEmpTotal[i] = accumulate;
            accumulate = 0;
        }
    }
    
    public static void displayTotalSalesHeading()
    {
        System.out.println("**********************************************************"
                + "\nEMPLOYEE TOTAL SALES"
                + "\n**********************************************************");
    }
    
    public static void displayTotalSales()
    {
        for (int i = 0; i < arrEmpSales.length; i++) 
        {
            System.out.println(arrEmpNum[i] + " --> R " + arrEmpTotal[i]);
        }
        System.out.println("**********************************************************");
    }
    
}

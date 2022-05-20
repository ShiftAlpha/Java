
package usecell;


public abstract class Cell implements iPrintable
{
    protected String cusName;
    protected int talkTime;
    protected double ppm;

    public Cell(String cusName, int talkTime, double ppm) 
    {
        this.cusName = cusName;
        this.talkTime = talkTime;
        this.ppm = ppm;
    }

    public String getCusName() 
    {
        return cusName;
    }

    public int getTalkTime() 
    {
        return talkTime;
    }

    public double getPpm() 
    {
        return ppm;
    }
    
    
    
}

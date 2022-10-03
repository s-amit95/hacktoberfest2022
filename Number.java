public class Number
{
    private int num;
    
    public Number(int num)
    {
        this.num = num;
    }
    public boolean isPositive()
    {
        return num >= 0;
    }
    public boolean isEven()
    {
        return num % 2 == 0;
    }
    public boolean isPrime()
    {
        // Corner case
        if (n <= 1)
        {
            return false;
        }
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public void setNum(int num)
    {
        try
        {
            this.num = num;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public int getNum()
    {
        return num;
    }
}
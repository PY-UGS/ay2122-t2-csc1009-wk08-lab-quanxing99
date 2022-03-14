
public class InsufficientFundException extends Exception
{
  
	private static final long serialVersionUID = 1L;
	private double amount;
    public InsufficientFundException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }
}



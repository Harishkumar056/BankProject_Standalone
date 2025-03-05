
package deposit;


public class Pojo 
{
    private double amount;
    private int accountNumber;
    private int pin;
    
    public void setAmount(double amount)
    {
        if(amount>0)
        {
            this.amount = amount;
        }
    }
    
    public double getAmount()
    {
        return amount;
    }
    
    public void setPin(int pin)
    {
        
        this.pin= pin;
    }
    
    public int getPin()
    {
        return pin;
    }
    
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
}

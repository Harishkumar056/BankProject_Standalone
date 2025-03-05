
package balanceEnquire;


public class BalancePojo 
{
    private int accno;
    private int pin;
    private double balance;

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
    public void setAmount(double balance)
    {
        this.balance = balance;
    }
    
    public double getAmount()
    {
        return balance;
    }
}

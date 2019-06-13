package Structural.Composite;

public class SavingsAccount extends Component
{
    private String accountNo;
    private float accountBalance;
          
    public SavingsAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }
 
    public String getAccountNo() {
        return accountNo;
    }
 
    public float getBalance() {
        return accountBalance;
    }
}
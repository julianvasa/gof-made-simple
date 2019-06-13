package Structural.Composite;

public class DepositAccount extends Component
{
    private String accountNo;
    private float accountBalance;
     
    public DepositAccount(String accountNo, float accountBalance) {
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
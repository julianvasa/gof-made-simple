package Structural.Composite;

public class CompositeAccount extends Component
{
    private float totalBalance;
 
    public float getBalance() {
        totalBalance = 0;
        for (Component f : list) {
            totalBalance = totalBalance + f.getBalance();
        }
        return totalBalance;
    }
}
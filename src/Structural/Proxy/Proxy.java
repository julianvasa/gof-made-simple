package Structural.Proxy;

public class Proxy extends ObjectImpl
{
    @Override
    public void doSomething()
    {
        //Perform additional logic and security
        //Even we can block the operation execution
        System.out.println("Delegating work on real object");
        super.doSomething();
    }
}
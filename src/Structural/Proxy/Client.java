package Structural.Proxy;

public class Client
{
    public static void main(String[] args)
    {
        Object proxy = new Proxy();
        proxy.doSomething();
    }
}
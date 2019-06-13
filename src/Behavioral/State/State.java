package Behavioral.State;

interface IState
{
    public void updateState(DeliveryContext ctx);
}

class Acknowledged implements IState
{
    //Singleton
    private static Acknowledged instance = new Acknowledged();
 
    private Acknowledged() {}
 
    public static Acknowledged instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is acknowledged !!");
        ctx.setCurrentState(Shipped.instance());
    }
}

class Shipped implements IState
{
    //Singleton
    private static Shipped instance = new Shipped();
 
    private Shipped() {}
 
    public static Shipped instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is shipped !!");
        ctx.setCurrentState(InTransition.instance());
    }
}

class InTransition implements IState
{
    //Singleton
    private static InTransition instance = new InTransition();
 
    private InTransition() {}
 
    public static InTransition instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}


class Delivered implements IState
{
    //Singleton
    private static Delivered instance = new Delivered();
 
    private Delivered() {}
 
    public static Delivered instance() {
        return instance;
    }
     
    //Business logic
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is delivered!!");
    }
}

class OutForDelivery implements IState
{
    //Singleton
    private static OutForDelivery instance = new OutForDelivery();
 
    private OutForDelivery() {}
 
    public static OutForDelivery instance() {
        return instance;
    }
     
    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is out of delivery !!");
        ctx.setCurrentState(Delivered.instance());
    }
}


class DeliveryContext {
     
    private IState currentState;
    private String packageId;
     
    public DeliveryContext(IState currentState, String packageId)
    {
        super();
        this.currentState = currentState;
        this.packageId = packageId;
         
        if(currentState == null) {
            this.currentState = Acknowledged.instance();
        }
    }
 
    public IState getCurrentState() {
        return currentState;
    }
 
    public void setCurrentState(IState currentState) {
        this.currentState = currentState;
    }
     
    public String getPackageId() {
        return packageId;
    }
 
    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }
 
    public void update() {
        currentState.updateState(this);
    }
}

public class State {

    public static void main( String[] args ) {
        DeliveryContext ctx = new DeliveryContext(null, "Test123");
         
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
        ctx.update();
    }
}
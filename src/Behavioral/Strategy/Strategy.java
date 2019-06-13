package Behavioral.Strategy;

interface ISocialMediaStrategy
{
    public void connectTo(String friendName);
}

class SocialMediaContext
{
    ISocialMediaStrategy smStrategy;
 
    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }
 
    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}

class FacebookStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}

class TwitterStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Twitter");
    }
}

class GooglePlusStrategy implements ISocialMediaStrategy {
 
    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through GooglePlus");
    }
}

public class Strategy {

       public static void main( String[] args ) {
        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();
 
        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Julian");
 
        System.out.println("====================");
 
        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Julian");
 
        System.out.println("====================");
 
        // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Julian");
 
    }
}
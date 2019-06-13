package Structural.Decorator;

public class DecorateTree {
    public static void main(String[] args) {
        ChristmasTree tree2 = new BubbleLights(new Ribbon(new ChristmasTreeImpl()));
          System.out.println(tree2.decorate()); 
        
    }
}
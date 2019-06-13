package Structural.Decorator;

public class BubbleLights extends TreeDecorator {
 
    ChristmasTree tree;
    public BubbleLights(ChristmasTree tree) {
        this.tree = tree;
    }
     
    public String decorate() {
        return this.tree.decorate() + decorateWithBubbleLights();
    }
     
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }
}
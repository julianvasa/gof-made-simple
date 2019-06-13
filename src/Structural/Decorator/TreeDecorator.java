package Structural.Decorator;

public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;
     
    // standard constructors
    @Override
    public String decorate() {
        return tree.decorate();
    }
}
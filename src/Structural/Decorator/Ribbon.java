package Structural.Decorator;

public class Ribbon extends TreeDecorator {
 
    ChristmasTree tree;
    public Ribbon(ChristmasTree tree) {
        this.tree = tree;
    }

    public String decorate() {
        return this.tree.decorate() + decorateWithRibbon();
    }
     
    private String decorateWithRibbon() {
        return " with Ribbon";
    }

}
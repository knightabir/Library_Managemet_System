package MultilevelInheritance;

public class Box {
    private double width;
    private double height;
    private double depth;


    //Creating constructor for the super class


    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    //Volume Calculation
    double volume(){
        return width*height*depth;
    }
}

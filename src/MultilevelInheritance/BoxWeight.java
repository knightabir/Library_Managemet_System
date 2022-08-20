package MultilevelInheritance;

public class BoxWeight extends Box{
    double weight;


    //Calling BoxWeight class Constructor
    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}

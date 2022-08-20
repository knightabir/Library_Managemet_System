package MultilevelInheritance;

public class Shipment extends BoxWeight {
    double cost;


    //Calling Shipment class constructor

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }
}


/*
2nd property of OOP is polymorphism


 */
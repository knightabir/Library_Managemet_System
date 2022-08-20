package polymorphism;

public class Circle extends Shapes{

    @Override  //This is called annotation
    void area() {
        System.out.println("The area is pie * r * r");
    }
}

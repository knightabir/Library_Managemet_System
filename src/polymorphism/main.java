package polymorphism;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        Shapes shapes = new Shapes();
        Shapes square = new Square();
        Shapes circle = new Circle();


        shapes.area();
        square.area();
        circle.area();

//        File file = new File("C://Users//asabi//Desktop//menu.txt");
//        FileReader fr = new FileReader(file);
//        System.out.println(fr);
    }
}

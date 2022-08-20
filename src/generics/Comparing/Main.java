package generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students abir = new Students(21,94.54f);
        Students rahul = new Students(12,85.65f);
        Students dev = new Students(1,91.5f);
        Students pratyay = new Students(12,58.54f);
        Students deep = new Students(21,77.54f);

        Students[] list = {abir,rahul,dev,pratyay,deep};

        System.out.println(Arrays.toString(list));

//        if (abir.compareTo(rahul)<0){
//            System.out.println("rahul has more marks");
//        }
//        else System.out.println("Abir has more marks");
    }
}

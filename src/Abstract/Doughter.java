package Abstract;

public class Doughter extends Parent{

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I Love " + name + " He is " + age );

    }
}

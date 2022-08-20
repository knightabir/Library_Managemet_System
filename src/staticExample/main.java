package staticExample;

public class main {
    public static void main(String[] args) {

        Human abir = new Human(2,"Abir sakar",23232,false);
        Human raju = new Human(24,"Raju Sarkar",65656,true);
        Human arzu = new Human(12,"Arzu Sarkar",000,false);

        main2();
    }

    static void main2(){

        main obj = new main();
        obj.main3();

        System.out.println("You are inside the main2 function");
    }

    void main3(){
        System.out.println(Human.population);
        System.out.println("Yor are inside the main3 function");
    }
}

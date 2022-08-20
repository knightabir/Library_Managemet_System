package com.abir;

public class TestGarbage {
//    public void finalize(){
//        System.out.println("Object is Garbage Collected");
//    }

    public static void main(String[] args) {
        Human abir = new Human(24,"Abir Sarkar", 0,false);
        Human raju = new Human(23,"Raju Mandal",2500,true);
        Human suman = new Human(25,"Suman Sarkar",3000,true);


        System.out.println(Human.population);
        System.out.println(abir.population);
        System.out.println(raju.population);
    }

}

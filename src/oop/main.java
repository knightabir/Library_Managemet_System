package oop;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
//        String[] std = new String[4];
//        Student std1 = new Student("Abir Sarkar",45,154);
//        Student std2 = new Student("rahul sarkar",46,254);
//        Student std3 = new Student("Rupam Sarkar",7,256);
//        Student std4 = new Student("Randam Name",8 ,457);
//
//        std[0] = std1.name;
//        std[1] = std2.name;
//        std[2] = std3.name;
//        std[3] = std4.name;
//        System.out.println(Arrays.toString(std));


    }


}
class Hotel{
    private int roll;
    private String name;

    public Hotel(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
}

class Student{
    String name;
    int rno;
    float mark;


    public Student(String name, int rno, float mark) {
        this.name = name;
        this.rno = rno;
        this.mark = mark;
    }
}



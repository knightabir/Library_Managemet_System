package Libreary_management_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int choice = 0;

        while (choice!=3){
            System.out.println("Enter 1 for module 1 \n Enter 2 for module 2");
            choice = obj.nextInt();

            if (choice == 1){
                Module1 obj1 = new Module1();
                System.out.println("Enter Student Name: ");
                obj1.name = obj.nextLine();
                obj1.name = obj.nextLine();

                System.out.println("Enter Father's Name: ");
                obj1.fname = obj.nextLine();

                System.out.println("Enter University Roll Number: ");
                obj1.unit_id = obj.nextLine();

                System.out.println("Enter the user id: ");
                obj1.uid = obj.nextLine();

                System.out.println("In which semester do you study: ");
                obj1.sem = obj.nextInt();

                obj1.setData(obj1.name, obj1.fname, obj1.unit_id, obj1.uid, obj1.sem);
                obj1.getData();
            }
            else if (choice == 2 ){
                Module2 obj2 = new Module2();
                obj2.chemistry();
                obj2.biology();
                obj2.physics();
            }
        }
    }
}

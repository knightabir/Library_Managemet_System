package com.abir;

import java.util.Scanner;

public class inout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int i = sc.nextInt();
            System.out.println(i);

            float f = sc.nextFloat();
            System.out.println(f);

            long l = sc.nextLong();
            System.out.println(l);

            byte b = sc.nextByte();
            System.out.println(b);

            sc.nextLine();

            String s = sc.nextLine();
            System.out.println(s);
        }
    }
}

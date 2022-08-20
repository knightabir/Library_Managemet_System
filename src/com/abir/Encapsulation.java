package com.abir;

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        r.setValue(125);
        System.out.println(r.getValue());
        System.gc();
    }

}
class A{
    private int value;
    public void setValue(int x){
        value=x;
    }
    public int getValue(){
        return value;
    }

}

package com.abir;

public class problem1678 {
    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
    }



    static String interpret(String command){
//        command=command.replace("()","o");
//        command=command.replace("(al)","al");
        command.replaceAll("()","o");
        return command;
    }
}

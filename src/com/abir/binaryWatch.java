package com.abir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binaryWatch {
    public static void main(String[] args) {
        List ans = possibletimes(1);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

    }

    static List<String> possibletimes(int turnedOn){
        List<String> ans = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                if (Integer.bitCount(hour)+Integer.bitCount(minute) == turnedOn){
                    StringBuilder time = new StringBuilder();
                    time.append(hour).append(":");

                    if (minute<10){
                        time.append("0");
                    }

                    time.append(minute);
                    ans.add(time.toString());
                }
            }
        }
        return ans;
    }
}

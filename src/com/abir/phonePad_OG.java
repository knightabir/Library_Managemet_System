package com.abir;

import java.util.ArrayList;
import java.util.List;

public class phonePad_OG {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    static ArrayList<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();

        if (digits.length()==0)
            return ans;
        phone(digits,"",ans);
        return ans;
    }

    static String[] code = {".",";","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    static void phone(String up, String p, List<String> ans){
        if (up.length()==0){
            ans.add(p);
            return;
        }

        int no = up.charAt(0)-'0';

        String cod = code[no];

        for (int i = 0; i < cod.length(); i++) {
            char ch = cod.charAt(i);
            phone(up.substring(1),p+ch,ans);
        }
    }
}

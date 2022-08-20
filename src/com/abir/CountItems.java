package com.abir;

import java.util.List;

public class CountItems {
//    public static void main(String[] args) {
//
//        // Here I don't fnd the way how to create a list ....
//
//
//        List<List<String>> items = [
//                ["phone","blue","pixel"],
//                {"computer","silver","lenovo"},
//                {"phone","gold","iphone"}
//        };
//        String ruleKey = "color";
//        String ruleValue= "silver";
//
//
//        System.out.println(count(items,ruleKey,ruleValue));
//    }




// Making the function for cheek all the items for the matching items in the list that are given.
    static int count(List<List<String>> items, String ruleKey, String ruleValue){
        int ans = 0; // initially declaring the count items as 0.

        // Running an If else statement to cheek the ruleKey matching index

        if (ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {

                //here only cheek that particular index where the types are declared.


                if (items.get(i).get(0).equals(ruleValue)){
                    ans ++;
                }
            }
        }
        else if (ruleKey.equals("color")){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(1).equals(ruleValue)){
                    ans++;
                }
            }
        }
        else{
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).get(2).equals(ruleValue)){
                    ans++;
                }
            }
        }
        return ans;
    }
}

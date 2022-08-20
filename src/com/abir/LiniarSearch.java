package com.abir;

public class LiniarSearch {

    public static void main(String[] args) {
        //Setting the arrays
        int[] abir = {54,5,8,1,5,78,41,8,7,5,54,87,48,4};
        //Setting the target for the search.
        int tgt = 414;
        //Calling the function and store the ans in the ans variable.
        int ans= search(abir,tgt);
        //Printing the answer that are sores in the  ans variable.
        System.out.println(ans);
    }


    static int search(int[] arr ,int target){
        //If there are no element in the array then this line will execute.
        if (arr.length==0){
            return  -1;
        }
        //Run a for loop.
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        //This line will execute if none of the return statements are matched the output.
        return -1;
    }
}

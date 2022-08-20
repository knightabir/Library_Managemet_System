package generics;

import java.util.Arrays;

public class customArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public customArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }

        data[size++] = num;

    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        // Copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data =temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "customArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        customArraylist list = new customArraylist();

        list.add(544);
        list.add(4545);


        System.out.println(list);
    }
}

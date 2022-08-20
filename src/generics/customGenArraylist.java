package generics;

import java.util.Arrays;

public class customGenArraylist<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;


    public customGenArraylist(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }

        data[size++] = num;

    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // Copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data =temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T) data[index];
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
        customGenArraylist list = new customGenArraylist();

        list.add(544);
        list.add("4545dsds");


        System.out.println(list);
    }
}

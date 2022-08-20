package exceptionHandeling;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b = 0;

        try{
            divide(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("No matter wat it will always run");
        }
    }

    static int divide(int a , int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}

package generics.Comparing;
import java.util.ArrayList;

public class lamdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

//        list.forEach((item) -> System.out.println(item*2));


        Operation add = (a,b) -> a + b;
        Operation sub = (a,b) -> a-b;
        Operation prod = (a,b) -> a*b;
        Operation div = (a,b) -> a/b;


        lamdaFunction myCalculator = new lamdaFunction();

        System.out.println(myCalculator.operate(5,3,add));
        System.out.println(myCalculator.operate(4,5,prod));
        System.out.println(myCalculator.operate(4,8,sub));
        System.out.println(myCalculator.operate(4,8,div));


    }
private int operate (int a , int b,Operation op){
            return op.operation(a,b);
        }
}
interface Operation{
            int operation(int a, int b);
}

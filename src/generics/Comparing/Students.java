package generics.Comparing;

public class Students implements Comparable<Students>{
    int rno;
    float marks;


    public Students(int rno, float marks) {
        this.rno = rno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Roll Number is : "+rno + " And the marks is: "+ marks;
    }

    @Override
    public int compareTo(Students o) {
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}

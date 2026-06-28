package Summer_Assignment_2401920100030.Week_4.OOPS.first;

interface Test {
    int square(int n);
}

class Arithmetic implements Test {
    public int square(int n) {
        return n * n;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();

        System.out.println("Square of 5 = " + obj.square(5));
    }
}
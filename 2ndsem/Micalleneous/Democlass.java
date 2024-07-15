import java.util.*;

class Demo {
    int a;

    public int area(int length, int breadth) {
        return (length * breadth);
    }

    void mul(int a, int b, int c) {
        System.out.println("Multiplication of three numbers" + (a * b * c));
    }
}

public class Democlass {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        System.out.println("The area is " + obj.area(length, breadth));
        obj.mul(10, 20, 30);
    }

}
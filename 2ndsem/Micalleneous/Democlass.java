import java.util.*;

class Demo {
    int a;

    public int sum(int length, int breadth) {
        return (length * breadth);
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
        System.out.println("The area is " + obj.sum(length, breadth));
    }

}
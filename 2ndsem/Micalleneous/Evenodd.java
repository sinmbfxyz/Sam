import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        System.out.println("Enter 1st number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.err.println("The even numbers from" + a + "to" + b + "not divisible by 5");
        for (int i = a; i <= b; i++) {
            if (i % 5 == 0) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }

    }
}
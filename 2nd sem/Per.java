import java.util.*;

public class Per {
    public static void main(String[] args) {
        System.out.println("Enter marks in 5 subject");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double sum = a + b + c + d + e;
        double per = (sum / 500) * 100;
        System.out.println("Sum is " + sum);
        System.out.println("Percentage is " + per);
        if (per >= 80) {
            System.out.println("Distinction");
        } else if (per >= 60) {
            System.out.println("First Division");
        } else if (per >= 50) {
            System.out.println("Second Division");
        } else {
            System.out.println("Fail");
        }
    }
}

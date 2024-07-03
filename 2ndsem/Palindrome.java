import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
        int rev = 0, rem;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println(rev);
        if (copy == rev) {
            System.out.println("Palindrome");

        } else {
            System.out.println("Not Palindrome");
        }
    }
}

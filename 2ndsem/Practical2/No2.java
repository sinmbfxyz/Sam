
import java.util.*;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int num = input.nextInt();
        int i = 1000, sum = 0, sum2 = 0, rev = 0, cpy = num;
        while (num != 0) {
            int quo = num / i;
            int rem = cpy % 10;
            rev = rev * 10 + rem;
            sum += quo;
            sum2 = sum2 + (quo * quo);
            System.out.println(quo);
            num %= i;
            i /= 10;
            cpy /= 10;
        }
        System.out.println("Reverse of the number is " + rev);
        System.out.println("Sum of the digits is " + sum);
        System.out.println("Sum of the square of digits is " + sum2);
    }
}

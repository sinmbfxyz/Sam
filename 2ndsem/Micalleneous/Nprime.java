import java.util.*;

public class Nprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int large = a, acheck = 0, bcheck = 0;
        if (b > a) {
            large = b;
            int temp = a;
            a = b;
            b = temp;

        }
        for (int i = 2; i < large; i++) {
            if (a % i == 0) {
                acheck++;
            }
            if (b % i == 0) {
                bcheck++;
            }
        }
        // System.out.println(acheck + " " + bcheck);
        if (acheck == 0 && bcheck == 1) {
            int diff = a - b;
            if (diff == 2) {
                System.out.println("Twin Prime");
            } else {
                System.out.println("Not twin");
            }

        } else {
            System.out.println("Not prime");
        }
    }
}

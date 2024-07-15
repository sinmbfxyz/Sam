import java.util.*;

class Prime {
    String Prim(int n) {
        boolean prime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            return ("NUmber is prime");
        } else {
            return ("NUmber is composite");
        }
    }
}

public class ClassPrime {
    public static void main(String[] args) {
        Prime p = new Prime();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(p.Prim(num));
    }
}

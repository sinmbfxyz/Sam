
public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean prime = true;
            if (i == 57) {
                break;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime && i != 1) {
                System.out.println(i);
            }
        }

    }
}

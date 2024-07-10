import java.util.*;

public class Primefromarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            int flag = 0;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag++;
                    break;
                }

            }
            if (flag == 0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum of the prime numbers in an array is " + sum);
    }
}

import java.util.*;
public class Sumavg{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter the elements of array");
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+= arr[i];
        }
        
        System.out.println("Sum of array elements is "+sum);
        System.out.println("Average of array elements is "+((double)sum/n));
    }
}
import java.util.*;
public class Ads{
    public static void main(String[] args)
    {
        System.out.println("Enteer a character: ");
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        if(ch >= 'a' && ch <='z' || ch>= 'A' && ch>='Z')
        {
            System.out.println("This is an alphabet");
        }
        else if(ch>='0' && ch<='9') 
        {
System.out.println("This is a digit");
        }
        else
        {
            System.out.println("This is a special character");
        }


    }
}

import java.util.*;

class Construct {
    private int a;
    private int b;// cannot be directly acessed by the object like obj.a=40 not allowed if private
                  // keyword is used

    public Construct(int a, int b) { // if parameterized constructor is called then the default constructor of the
                                     // complieer is overwwitten hence error is occured
        this.a = a;
        this.b = b;
    }

    public Construct() {
        System.out.print(this.a);// explicit default constructor
    }

    public int area() {
        return (this.a * this.b);
    }
}

public class ClassDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Construct obj = new Construct(a, b);
        System.out.println("Area of the rectangle is " + obj.area());
    }
}
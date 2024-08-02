import java.util.*;

class Demo {
    private int a;//3
    private int b;//4

    public Demo() {
        a = 0;
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void Swap(Demo r1) {
        r1.a = 4;
        r1.b = 3;
    }

    public void display() {
        System.out.println(this.a);
        System.out.println(this.b);
    }
}

public class Valueandref {
    public static void main(String[] args) {
        int x = 3, y = 4;
        Demo d1 = new Demo(x, y);
        Demo d2 = new Demo();
        d2.Swap(d1);// call by reference;
        d1.display();
    }
}

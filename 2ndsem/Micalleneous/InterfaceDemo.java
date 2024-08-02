
interface Calcs {// interface ko object banauna mildaina
    abstract void display();

    abstract void calcArea(int x, int y);
}

class Demo implements Calcs {
    @Override
    public void display() {
        System.out.println("Hello World");
    }

    @Override
    public void calcArea(int x, int y) {
        System.out.println("The area of the rectangle is: " + (x * y));
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Calcs c1 = d1; // parent ko reference variable ma child ko object rakhne lai dynamic method
                       // dispatch
        c1.display();
        c1.calcArea(100, 200);
        d1.display();
        d1.calcArea(10, 20);
    }
}

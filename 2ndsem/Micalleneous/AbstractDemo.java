
abstract class Box {
    abstract void box(int x, int y);
}

class Rectangle extends Box {
    public void box(int x, int y) {
        System.out.println("The area of the rectangle is " + (x * y));
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.box(2, 3);
    }
}
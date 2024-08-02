class Rectangle {
    static int a;// can only be accessed using the class name
    static int b;

    public static void display() {
        System.out.println("Hello this is static method " + Rectangle.b);
        System.out.println("Hello this is static method " + Rectangle.a);
    }

    static {
        b = a * 100;// this will be executed first
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Rectangle.a = 12;
        Rectangle.display();
    }
}
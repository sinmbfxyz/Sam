
class Outer {
    private int a = 90;

    public void display() {
        System.out.println("Thie is the display method");
    }

    public void callInnerClass() {
        Inner inner = new Inner();
        inner.call();
    }

    private class Inner {

        public void call() {
            display();
            System.out.println(a);
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.callInnerClass();
    }
}


class Parent {
    int a = 20;

    public Parent() {
        System.out.println("Thie is parent default constructor");
    }

    public Parent(int x) {
        System.out.println("This is parameterized constructoer of parent with value : " + x);
    }

    public void display() {
        System.out.println("This is parent display method");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("This is child default constructor");
    }

    public Child(int x) {
        super(20);
        System.out.println("This is parameterized constructor of child with value ; " + x);
    }

    public void display() {
        super.display();
        System.out.println("This is child display method");
        System.out.println("The value of a of parent class " + super.a);

    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child c1 = new Child();// default constructor of both parent and class will be called
        Child c2 = new Child(3);
        c1.display();// This will only call child method if child class ma super bhayena bhane
    }
}

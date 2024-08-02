
class Demo {
    public void display() {
        System.out.println("The first display is shown");
    }

    public void display(int x) {
        System.out.println("The second display is shown with value passed as" + x);
    }

    public void display(int x, int y) {
        System.out.println("The third display is shown with value passed as" + x + " " + y);
    }
}

public class Methodoverloading {
public static void main(String[] args) {
    Demo obj= new Demo();
    obj.display();//1st method will be called
    obj.display(1);//2nd method will be called
    obj.display(1,2);//3rd method will be called
}
}
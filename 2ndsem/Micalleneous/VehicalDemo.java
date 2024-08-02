
import java.util.*;

class Vehical {
    private String name;
    private String brand;
    private double tax;

    public void setVehicle(String name, String brand, double tax) {
        this.name = name;
        this.brand = brand;
        this.tax = tax;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getTax() {
        return this.tax;
    }
}

public class VehicalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the vehicle1");
        String name1 = sc.next();
        System.out.println("Enter the brand of the vehicle1");
        String brand1 = sc.next();
        System.out.println("Enter the tax of the vehicle1 ");
        double tax1 = sc.nextDouble();
        Vehical v1 = new Vehical();
        v1.setVehicle(name1, brand1, tax1);

        System.out.println("Enter the name of the vehicle2 ");
        String name2 = sc.next();
        System.out.println("Enter the brand of the vehicle2 ");
        String brand2 = sc.next();
        System.out.println("Enter the tax of the vehicle2 ");
        double tax2 = sc.nextDouble();
        Vehical v2 = new Vehical();
        v2.setVehicle(name2, brand2, tax2);

        if (v1.getTax() > v2.getTax()) {
            System.out.println("The details of the vehicle 1 are");
            System.out.println("Name: " + v1.getName());
            System.out.println("Brand: " + v1.getBrand());
        } else {
            System.out.println("The details of the vehicle 2 are");
            System.out.println("Name: " + v2.getName());
            System.out.println("Brand: " + v2.getBrand());
        }

    }
}

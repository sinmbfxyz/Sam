import java.util.*;

class Product {
    private String name;
    private int qty;
    private int price;

    public Product(String name, int qty, int price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int qty() {
        return this.qty;
    }

    public int price() {
        return this.price;
    }

    public int getTotalPrice() {
        return (this.qty * this.price);
    }

}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the product");
        String name = sc.next();
        System.out.println("Enter the price of the product ");
        int price = sc.nextInt();
        System.out.println("Enter the quantity of the product");
        int qty = sc.nextInt();
        Product p1 = new Product(name, qty, price);

        System.out.println("Enter the name of the product");
        String name1 = sc.next();
        System.out.println("Enter the price of the product ");
        int price1 = sc.nextInt();
        System.out.println("Enter the quantity of the product");
        int qty1 = sc.nextInt();
        Product p2 = new Product(name1, qty1, price1);

        System.out.println("Name of product1" + p1.getName());
        System.out.println("Quantity of product1" + p1.qty());
        System.out.println(" Price of product1" + p1.price());
        System.out.println("Total price= " + p1.getTotalPrice());

        System.out.println("Name of product2" + p2.getName());
        System.out.println("Quantity of product2" + p2.qty());
        System.out.println(" Price of product2" + p2.price());
        System.out.println("Total price= " + p2.getTotalPrice());

    }
}

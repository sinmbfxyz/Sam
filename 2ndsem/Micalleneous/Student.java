import java.util.*;

class Detail {
    private String name;
    private String faculty;
    private int percentage;

    public void setData(String name, String faculty, int percentage) {
        this.name = name;
        this.faculty = faculty;
        this.percentage = percentage;
    }

    public void display() {
        System.out.println("The name of Student is " + this.name);
        System.out.println("The faculty of Student is " + this.faculty);
        System.out.println("The percentage of Student is " + this.percentage);
    }

    public String Nam() {
        return this.name;
    }

    public String facult() {
        return this.faculty;
    }

    public int Per() {
        return this.percentage;
    }
}

public class Student {
    public static void main(String[] args) {
        Detail stu1 = new Detail();
        Detail stu2 = new Detail();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student 1: ");
        String name = sc.next();
        System.out.println("Enter the faculty of Student 1:");
        String faculty = sc.next();
        System.out.println("Enter the percentage of Student 1: ");
        int percentage = sc.nextInt();
        stu1.setData(name, faculty, percentage);

        System.out.println("Enter the name of Student 2: ");
        String name1 = sc.next();
        System.out.println("Enter the faculty of Student 2:");
        String faculty1 = sc.next();
        System.out.println("Enter the percentage of Student 2: ");
        int percentage1 = sc.nextInt();
        stu2.setData(name1, faculty1, percentage1);

        int stper1 = stu1.Per();
        int stper2 = stu2.Per();
        if (stper1 > stper2) {
            System.out.println("Student 1 has higher percentage that is " + stu1.Per());
        } else {
            System.out.println("Student 2 has higher percentage that is" + stu2.Per());
        }
    }
}

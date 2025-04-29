
class Demo {

    String name = "Pooja";
    int age = 20;
    String DOB = "2005-01-03";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + DOB);
    }
}

public class Student1 {

    public static void main(String args[]) {
        Demo s = new Demo();
        s.display();
    }
}

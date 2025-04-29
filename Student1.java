
class Student1 {

    String name = "Pooja";
    int age = 20;
    String DOB = "2005-01-03";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DOB: " + DOB);
    }
}

class Demo {

    public static void main(String args[]) {
        Student1 s = new Student1();
        s.display();
    }
}

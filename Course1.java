
public class Course1 {

    String course;
    int sem;
    int marks;

    Course1(String course, int sem, int marks) {
        this.course = course;
        this.sem = sem;
        this.marks = marks;
    }

    void display() {
        System.out.println("Course: " + course);
        System.out.println("Semester: " + sem);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Course1 c1 = new Course1("Java", 4, 30);
        Course1 c2 = new Course1("Big data", 4, 31);
        Course1 c3 = new Course1("Devops", 4, 35);
        c1.display();
        c2.display();
        c3.display();
    }
}

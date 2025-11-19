public class Student {
    String name;
    int marks;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    public Student(Student s) {
        this.name = s.name;
        this.marks = s.marks;
    }
}

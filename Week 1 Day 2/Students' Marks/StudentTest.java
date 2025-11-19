public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(89, "Raheel");
        Student s2 = new Student(s1);

        System.out.println("Original: " + s1.name + " " + s1.marks);
        System.out.println("Copy: " + s2.name + " " + s2.marks);


    }
}

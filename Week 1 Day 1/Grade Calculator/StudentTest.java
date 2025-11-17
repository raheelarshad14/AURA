public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Raheel");
        s1.setQuizMarks(85);
        s1.setAssignmentMarks(90);
        s1.setMidMarks(75);
        s1.setFinalMarks(90);

        System.out.println(s1.getName() + " has secured a total of all combined weightages of respective marks fields:");
        System.out.println(s1.calculateTotal());
    }
}

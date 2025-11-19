public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Raheel", 10, 8, 89);
        Student s2 = new Student("Danish", 10, 9, 94);
        Student s3 = new Student("Mahnoor", 10, 7, 91);
        Student s4 = new Student("Ayesha", 10, 8, 95);
        Student s5 = new Student("Sudais", 10, 7, 56);

        System.out.println(s1.name +", " + "Marks: " + s1.marks + ", " + "Attendance: " + s1.attendancePercentage() + "%");
        System.out.println(s2.name +", " + "Marks: " + s2.marks + ", " + "Attendance: " + s2.attendancePercentage() + "%");
        System.out.println(s3.name +", " + "Marks: " + s3.marks + ", " + "Attendance: " + s3.attendancePercentage() + "%");
        System.out.println(s4.name +", " + "Marks: " + s4.marks + ", " + "Attendance: " + s4.attendancePercentage() + "%");
        System.out.println(s5.name +", " + "Marks: " + s5.marks + ", " + "Attendance: " + s5.attendancePercentage() + "%");

        System.out.println("Total Students: " + Student.studentCount);
        System.out.println("Average Marks: " + Student.averageMarks());

    }
}

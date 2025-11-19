public class Student {
    static int studentCount = 0;
    static int totalMarks = 0;

    String name;
    int totalClasses;
    int attendedClasses;
    int marks;

    static double averageMarks(){
        return totalMarks/(double)studentCount;
    }

    public Student(String name, int totalClasses, int attendedClasses, int marks) {
        this.name = name;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
        this.marks = marks;
        studentCount++;
        totalMarks += marks;
    }

    public Student(Student s){
        this.name = s.name;
        this.totalClasses = s.totalClasses;
        this.attendedClasses = s.attendedClasses;
        this.marks = s.marks;
    }

    public double attendancePercentage(){
        return ((double)this.attendedClasses * 100) / this.totalClasses;
    }
}

public class Student {
    private String name;
    private int quizMarks;
    private int assignmentMarks;
    private int midMarks;
    private int finalMarks;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuizMarks(int quizMarks) {
        this.quizMarks = quizMarks;
    }

    public void setAssignmentMarks(int assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public void setMidMarks(int midMarks) {
        this.midMarks = midMarks;
    }

    public void setFinalMarks(int finalMarks) {
        this.finalMarks = finalMarks;
    }

    public double calculateTotal(){
        double totalMarks = 100.0;
        double combineMarks = ((quizMarks/totalMarks)*10) + ((assignmentMarks/totalMarks)*20)
                + ((midMarks/totalMarks)*30) + ((finalMarks/totalMarks)*40);
        return combineMarks;
    }
}

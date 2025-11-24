public class WorkOutPlan {
    public String todaysWorkout;

    public WorkOutPlan(String todaysWorkout) {
        this.todaysWorkout = todaysWorkout;
        System.out.println("Workout Plan Created");
    }
    public void  showWorkOutPlan() {
        System.out.println(todaysWorkout);
    }
}

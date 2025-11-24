public class UserProfile {
    HealthStats healthStats;
    WorkOutPlan workOutPlan;
    DietPlan dietPlan;

    public UserProfile(HealthStats healthStats, WorkOutPlan workOutPlan, DietPlan dietPlan) {
        this.healthStats = healthStats;
        this.workOutPlan = workOutPlan;
        this.dietPlan = dietPlan;
    }
    public void showDailySummary(){
        System.out.println("Daily summary");
        healthStats.showStats();
        workOutPlan.showWorkOutPlan();
        dietPlan.showMealPlan();
    }
}

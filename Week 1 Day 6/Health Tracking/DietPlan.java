public class DietPlan {
    public String todaysMealPlan;

    public DietPlan(String todaysMealPlan) {
        this.todaysMealPlan = todaysMealPlan;
        System.out.println("Diet Plan Created");
    }
    public void showMealPlan() {
        System.out.println(todaysMealPlan);
    }
}

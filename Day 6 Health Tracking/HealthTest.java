public class HealthTest {
    public static void main(String[] args) {
        HealthStats h1 = new HealthStats(72, 600);
        WorkOutPlan w1 = new WorkOutPlan("Push Ups and Running");
        DietPlan d1 = new DietPlan("Eggs, Rice and Chicken");

        UserProfile p1 = new UserProfile(h1, w1, d1);
        p1.showDailySummary();
    }
}

public class HealthStats {
    public int heartRate;
    public int stepCount;

    public HealthStats(int heartRate, int stepCount) {
        this.heartRate = heartRate;
        this.stepCount = stepCount;
        System.out.println("Health Stats Created");
    }

    public void showStats() {
        System.out.println("HeartRate : " + heartRate);
        System.out.println("StepCount : " + stepCount);
    }
}

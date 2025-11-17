public class Ride {
    private int distanceKm;
    private int farePerKM;
    private int totalFare;

    public Ride(int distanceKm, int farePerKM) {
        this.distanceKm = distanceKm;
        this.farePerKM = farePerKM;
    }
    private void calculateFare(){
        totalFare = distanceKm * farePerKM;
    }
    public void confirmRide(){
        calculateFare();
    }

    public int getTotalFare() {
        return totalFare;
    }
}

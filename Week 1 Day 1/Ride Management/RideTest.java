public class RideTest {
    public static void main(String[] args) {
        Ride ride1 = new Ride(12, 40);
        ride1.confirmRide();
        System.out.println(ride1.getTotalFare());
    }
}

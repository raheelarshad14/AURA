public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine m1 = new CoffeeMachine(500, 200);
        m1.makeCoffee();
        m1.makeCoffee();
        m1.makeCoffee();

        m1.refill(500,200);

        System.out.println("The number of cups made are:");
        System.out.println(m1.getCupsMade());
    }
}

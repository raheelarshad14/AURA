public class Elephant extends Animal{
    double trunkLength;

    public Elephant(String name, int age, double trunkLength) {
        super(name, age);
        this.trunkLength = trunkLength;
        System.out.println("Elephant created!");
    }
    @Override
    void makeSound() {
        System.out.println("Trumpet!");
    }
}

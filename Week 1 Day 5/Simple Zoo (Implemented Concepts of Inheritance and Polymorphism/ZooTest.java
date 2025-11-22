public class ZooTest {
    public static void displayAnimal(Animal a){
        System.out.println(a.toString());
        a.makeSound();
    }
    public static void main(String[] args) {
        Lion L1 = new Lion("Simba", 7, 10);
        Elephant E1 = new Elephant("Bob", 8, 20);

        displayAnimal(L1);
        displayAnimal(E1);

        Animal a1 = new Lion("Mowgli", 8, 10);
        System.out.println(a1.name);
        System.out.println(a1);


    }
}

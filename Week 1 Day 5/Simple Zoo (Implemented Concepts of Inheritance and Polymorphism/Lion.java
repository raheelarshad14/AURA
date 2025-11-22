public class Lion extends Animal{
    int prideSize;

    public Lion(String name, int age, int prideSize) {
        super(name, age);
        this.prideSize = prideSize;
        System.out.println("Lion created!");
    }

    @Override
    void makeSound(){
        System.out.println("Roar!");
    }

    void play(){
        System.out.println("Lion is playing");
    }
    void play(String toy){
        System.out.println("Lion is playing with" + toy);
    }
}

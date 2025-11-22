public class Animal {
    String name = "Generic Animal";
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal created!");
    }

    void makeSound() {
        System.out.println("Some Generic Animal Sound");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
}


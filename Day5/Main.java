// Superclass Animal
 class Animal {
    // Attributes for name and age
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
// Subclass Dog
 class Dog extends Animal {
    
    // Constructor to initialize Dog's name and age
    public Dog(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Woof!");
    }
}
// Subclass Cat
 class Cat extends Animal {

    // Constructor to initialize Cat's name and age
    public Cat(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Meow!");
    }
}
// Subclass Bird
 class Bird extends Animal {

    // Constructor to initialize Bird's name and age
    public Bird(String name, int age) {
        super(name, age); // Call the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says Tweet!");
    }
}
// Main class to test the hierarchy
public class Main {
    public static void main(String[] args) {
        // Create instances of each subclass
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Call makeSound on each instance
        dog.makeSound(); // Outputs: Buddy says Woof!
        cat.makeSound(); // Outputs: Whiskers says Meow!
        bird.makeSound(); // Outputs: Tweety says Tweet!
    }
}

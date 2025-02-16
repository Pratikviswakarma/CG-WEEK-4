package override;

public class TestOverride {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls Animal's makeSound()

        Dog myDog = new Dog();
        myDog.makeSound(); // Calls Dog's overridden makeSound()
    }
}


public class SuperFinalDemo {
    public static void main(String[] args) {
        Dog d = new Dog("BuddyOwnerName", 101, "Rex");
        d.speak();               // overridden method that calls super.speak()
        d.showId();              // final method from parent
        d.displayNames();        // shows shadowed field vs super.field
        d.move();                // overridden move that calls super.move()

        // final local variable demonstration
        final int MAX = 5;
        System.out.println("Final local MAX = " + MAX);
        // MAX = 6; // uncommenting this will cause a compile-time error

        System.out.println("--- Demonstration complete ---");
    }
}

class Animal {
    protected String name;        // parent name field
    protected final int id;       // final field: cannot be reassigned after initialization

    public Animal(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void speak() {
        System.out.println("Animal " + name + " makes a sound.");
    }

    public final void showId() {
        // final method: cannot be overridden by subclasses
        System.out.println("Animal ID (final field) = " + id);
    }

    public void move() {
        System.out.println("Animal " + name + " moves.");
    }
}

class Dog extends Animal {
    // This field shadows the parent `name` field. Use `super.name` to access the parent's value.
    protected String name;

    public Dog(String name, int id, String dogName) {
        super(name, id); // use of `super` to call parent constructor
        this.name = dogName; // shadowed field holds the dog's own name
    }

    @Override
    public void speak() {
        System.out.println("Dog " + name + " barks.");
        // call the parent version with `super` to show both behaviors
        super.speak();
    }

    public void displayNames() {
        System.out.println("this.name (dog's name) = " + this.name);
        System.out.println("super.name (owner/parent name) = " + super.name);

        // Attempting to reassign a final field would fail at compile time:
        // this.id = 999; // uncommenting this line causes a compile error: cannot assign a value to final variable id
    }

    @Override
    public void move() {
        System.out.println("Dog " + name + " runs.");
        super.move();
    }
}

// Demonstrating a final class: this class cannot be extended by any other class.
final class FinalHelper {
    public static void helper() {
        System.out.println("FinalHelper helper method (class is final, so it can't be subclassed).");
    }
}

public class MainProgram {
    public static void main(String[] args) {
        // Create objects of subclasses
        Animal lion = new Animal();
        Robot robot1 = new Robot();

        // Demonstrate method overriding
        System.out.println("=== Method Overriding ===");
        lion.performAction();   // Animal-specific action
        robot1.performAction(); // Robot-specific action

        // Demonstrate method overloading
        System.out.println("\n=== Method Overloading ===");
        lion.displayDetails();                 // Default message
        lion.displayDetails("Lion is strong"); // Custom message

        robot1.displayDetails();                  // Default message
        robot1.displayDetails("Robot is active"); // Custom message

        // Demonstrate runtime polymorphism
        System.out.println("\n=== Runtime Polymorphism ===");
        PolymorphismDemo.executeAction(lion);   // Calls Animal version
        PolymorphismDemo.executeAction(robot1); // Calls Robot version
    }
}

// Method demonstrating runtime polymorphism
public class PolymorphismDemo {
    public static void executeAction(Entity entity) {
        // Calls the overridden method depending on object type
        entity.performAction();
    }
}

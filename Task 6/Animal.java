// Subclass 1
class Animal extends Entity {
    @Override
    public void performAction() {
        System.out.println("Animal roars or moves in its own way.");
    }
}

// Subclass 2
class Robot extends Entity {
    @Override
    public void performAction() {
        System.out.println("Robot executes programmed tasks.");
    }
}

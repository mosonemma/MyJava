// Base class
class Entity {
    // General action method (to be overridden)
    public void performAction() {
        System.out.println("Entity performs a generic action.");
    }

    // Method overloading for displaying details

    // Version 1: No parameters
    public void displayDetails() {
        System.out.println("Displaying default entity details.");
    }

    // Version 2: Takes a parameter
    public void displayDetails(String info) {
        System.out.println("Displaying entity details: " + info);
    }
}

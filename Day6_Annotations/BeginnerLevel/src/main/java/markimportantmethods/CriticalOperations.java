package markimportantmethods;

public class CriticalOperations {

    @ImportantMethod(level = "CRITICAL")
    public void processData() {
        System.out.println("Processing critical data...");
    }

    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data securely...");
    }

    public void normalMethod() {
        System.out.println("This method is not marked as important.");
    }
}


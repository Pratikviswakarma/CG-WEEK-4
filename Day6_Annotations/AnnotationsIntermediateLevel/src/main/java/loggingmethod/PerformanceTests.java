package loggingmethod;

public class PerformanceTests {

    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    @LogExecutionTime
    public void slowMethod() {
        System.out.println("Executing slow method...");
        try {
            Thread.sleep(100); // Simulate a slow process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


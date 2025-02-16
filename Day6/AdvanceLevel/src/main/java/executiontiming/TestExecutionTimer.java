package executiontiming;

public class TestExecutionTimer {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();
        ExecutionTimer.measureExecutionTime(mathUtils, "compute");
    }
}


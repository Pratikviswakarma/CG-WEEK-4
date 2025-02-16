package executiontiming;

public class MathUtils {
    public void compute() {
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        System.out.println("Computation done.");
    }
}


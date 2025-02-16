package customloggingproxy;

public class TestLoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxy = LoggingProxy.createProxy(greeting, Greeting.class);

        proxy.sayHello();
    }
}


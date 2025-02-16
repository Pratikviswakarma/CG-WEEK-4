package jsonrepresentation;

public class TestJsonSerializer {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(JsonSerializer.toJson(user));
    }
}


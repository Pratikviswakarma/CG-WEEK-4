package customobjectmapper;

import java.util.HashMap;
import java.util.Map;

public class TestObjectMapper {
    public static void main(String[] args) {
        Map<String, Object> userData = new HashMap<>();
        userData.put("name", "Alice");
        userData.put("age", 25);

        User user = ObjectMapper.toObject(User.class, userData);
        System.out.println(user);
    }
}
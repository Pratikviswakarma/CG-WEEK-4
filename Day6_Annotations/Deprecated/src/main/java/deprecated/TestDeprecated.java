package deprecated;

public class TestDeprecated {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // This will show a warning
        api.newFeature(); // Recommended method
    }
}


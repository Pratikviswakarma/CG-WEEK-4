package deprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Warning: oldFeature() is deprecated. Use newFeature() instead.");
    }

    public void newFeature() {
        System.out.println("newFeature() is the recommended method.");
    }
}


package roleallowed;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface RoleAllowed {
    String value();  // Role required to access the method
}


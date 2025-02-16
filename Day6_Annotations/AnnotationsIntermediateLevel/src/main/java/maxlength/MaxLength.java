package maxlength;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)           // Can only be applied to fields
public @interface MaxLength {
    int value();  // Maximum allowed length
}



package markimportantmethods;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.METHOD)          // Can only be applied to methods
public @interface ImportantMethod {
    String level() default "HIGH";   // Optional parameter with default value
}


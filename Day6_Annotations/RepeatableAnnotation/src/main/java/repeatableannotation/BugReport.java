package repeatableannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class) // Makes @BugReport repeatable
public @interface BugReport {
    String description();
    String reportedBy();
}


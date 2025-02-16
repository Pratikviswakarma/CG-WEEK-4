package annotationsatruntime;

import java.lang.annotation.Annotation;

public class RetrieveAnnotation {
    public static void main(String[] args) {
        try {
            Class<?> bookClass = Class.forName("Book");

            if (bookClass.isAnnotationPresent(Author.class)) {
                Author author = bookClass.getAnnotation(Author.class);
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package roleallowed;

import java.lang.reflect.Method;

public class AccessControl {

    private static final String currentUserRole = "USER"; // Simulated current user role

    public static void main(String[] args) {
        SecureService service = new SecureService();
        checkAccessAndInvoke(service, "performAdminTask");
        checkAccessAndInvoke(service, "performUserTask");
    }

    private static void checkAccessAndInvoke(Object object, String methodName) {
        try {
            Method method = object.getClass().getDeclaredMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if (!currentUserRole.equals(requiredRole)) {
                    System.out.println("Access Denied! Required role: " + requiredRole);
                    return;
                }
            }

            method.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


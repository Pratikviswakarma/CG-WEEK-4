package roleallowed;

public class SecureService {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed successfully!");
    }

    @RoleAllowed("USER")
    public void performUserTask() {
        System.out.println("User task executed successfully!");
    }
}

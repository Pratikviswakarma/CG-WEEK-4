package dependencyinjection;

public class UserService {
    @Inject
    private DatabaseService databaseService;

    public void performAction() {
        databaseService.connect();
        System.out.println("User action performed.");
    }
}

import databaseconnections.DatabaseConnections;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionsTest {
    DatabaseConnections dc=new DatabaseConnections();
    @BeforeEach
    void beforemethod(){
        dc.connect();
    }
    @Test
    void test(){
        
    }
    @AfterEach
    void aftermethod(){
        dc.disconnect();
    }
}

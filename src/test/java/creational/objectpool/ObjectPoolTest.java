package creational.objectpool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by Rana on 03/02/2022.
 */
public class ObjectPoolTest {
    private DatabaseConnectionPool databaseConnectionPool;

    @BeforeEach
    public void setUp() {
        databaseConnectionPool = new DatabaseConnectionPool();
    }

    @Test
    public void acquireWillCreateNewObject() {
        DatabaseConnection object = databaseConnectionPool.acquire();
        Assertions.assertNotNull(object);
    }

    @Test
    public void acquireWillCreateNewObjectWhenAvailableListEmpty() {
        DatabaseConnection object = databaseConnectionPool.acquire();
        DatabaseConnection object2 = databaseConnectionPool.acquire();

        Assertions.assertNotEquals(object, object2);
    }

    @Test
    public void acquireWillNotCreateObjectWhenAvailableListNotEmpty() {
        DatabaseConnection object = databaseConnectionPool.acquire();
        databaseConnectionPool.release(object);

        DatabaseConnection object2 = databaseConnectionPool.acquire();

        Assertions.assertEquals(object, object2);
    }
}

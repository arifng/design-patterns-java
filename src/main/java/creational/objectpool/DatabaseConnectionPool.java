package creational.objectpool;

/**
 * Created by Rana on 03/02/2022.
 */
public class DatabaseConnectionPool extends ObjectPool<DatabaseConnection> {

    public DatabaseConnectionPool() {
        super();
    }

    @Override
    protected DatabaseConnection create() {
        return new DatabaseConnection();
    }
}

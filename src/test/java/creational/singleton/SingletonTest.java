package creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Rana on 11/12/2021.
 */
public class SingletonTest {
    @Test
    public void checkOnlyOneInstanceReturnEveryTime() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        Assertions.assertEquals(instance1, instance2);
    }
}

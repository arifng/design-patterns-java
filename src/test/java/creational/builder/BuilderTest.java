package creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Rana on 14/01/2022.
 */
public class BuilderTest {
    @Test
    public void buildPersonWithNameOnly() {
        Person person = Person.builder()
                .name("Person name")
                .build();

        Assertions.assertEquals("Person name", person.getName());

        // Other nulls
        Assertions.assertNull(person.getAddress());
        Assertions.assertNull(person.getAge());
    }
}

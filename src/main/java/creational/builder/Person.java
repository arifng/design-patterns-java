package creational.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Rana on 14/01/2022.
 */
@Getter
@Setter
public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String name;
        private Integer age;
        private String address;

        PersonBuilder() {

        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.age, this.address);
        }
    }
}

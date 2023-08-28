package lesson4Task8;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void testEquals() {
        Person person1 = new Person("John", 28, "Male", "Ireland");
        Person person2 = new Person("Selina", 25, "Female", "UK");
        boolean expectedResult = false;
        boolean result = person1.equals(person2);
        assertEquals(expectedResult, result);
    }
}
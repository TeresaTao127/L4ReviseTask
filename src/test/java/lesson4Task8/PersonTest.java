package lesson4Task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void shouldReturnFalseForEqualMethod() {
        Person person1 = new Person("John", 28, "Male", "Ireland");
        Person person2 = new Person("Selina", 25, "Female", "UK");
        boolean expectedResult = false;
        boolean result = person1.equals(person2);
        assertEquals(expectedResult, result);
    }

    @org.junit.jupiter.api.Test
        void shouldReturnTrueForEqualMethod() {
        Person person3 = new Person("Mike", 30, "Male", "China");
        Person person4 = new Person("Mike", 30, "Male", "China");
        boolean expectedResult1=true;
        boolean result1=person3.equals(person4);
        assertEquals(expectedResult1,result1);
    }
}
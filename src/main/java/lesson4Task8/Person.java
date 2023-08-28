package lesson4Task8;

import java.util.Objects;

public class Person {
    String name;
    int age;
    String gender;
    String nationality;
    public Person(String name, int age, String gender, String nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, nationality);
    }



}

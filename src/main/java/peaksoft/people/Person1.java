package peaksoft.people;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.animal.Animal;

@Component
@NoArgsConstructor
@Getter @Setter
@ToString
public class Person1 {
    @Value("${person.name}")
    private String name;
    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.age}")
    private int age;

    private Animal animal;

    public Person1(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Autowired
    public Person1(@Qualifier("horse") Animal animal) {
        this.animal = animal;
    }

    public void favoritAnimal() {
        animal.animalPlus();
        animal.animalMinus();
    }
}

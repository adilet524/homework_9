package peaksoft.people;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.animal.Animal;

@Component
@NoArgsConstructor
@Getter @Setter
@ToString
public class Person2 {
    @Value("${person.name2}")
    private String name;
    @Value("${person.lastName2}")
    private String lastName;
    @Value("${person.age2}")
    private int age;

    private Animal animal;

    public Person2(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Autowired

    public Person2(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void favoriteAnimal() {
        animal.animalPlus();
        animal.animalMinus();
    }
}

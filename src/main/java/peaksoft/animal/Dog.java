package peaksoft.animal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Dog implements Animal {
    @Value("${dog.name}")
    private String name;
    @Value("${dog.breed}")
    private String breed;
    @Value("${dog.color}")
    private String color;
    @Value("${dog.age}")
    private int age;


    @Override
    public void animalPlus() {
        System.out.println(name + "'s plus method!");
    }

    @Override
    public void animalMinus() {
        System.out.println( name + "'s minus method!");
    }
}

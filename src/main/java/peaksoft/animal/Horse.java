package peaksoft.animal;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Horse implements Animal {
    @Value("${horse.name}")
    private String name;
    @Value("${horse.breed}")
    private String breed;
    @Value("${horse.color}")
    private String color;
    @Value("${horse.age}")
    private int age;

    @Override
    public void animalPlus() {
        System.out.println(name + "'s plus method!");
    }

    @Override
    public void animalMinus() {
        System.out.println(name + "'s minus method!");
    }
}

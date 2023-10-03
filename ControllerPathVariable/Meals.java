package DevelhopeSpringBootExercises.ControllerPathVariable;

import lombok.Data;

@Data
public class Meals {
    String name;
    String description;
    double price;
    public Meals(String name, String description, double price){
        this.name = name;
        this.description =description;
        this.price = price;
    }

}

package DevelhopeSpringBootExercises.ControllerPathVariable;

import lombok.Data;

@Data
public class Meals {
    String name;
    String description;
    public Meals(String name, String description){
        this.name = name;
        this.description =description;
    }

}

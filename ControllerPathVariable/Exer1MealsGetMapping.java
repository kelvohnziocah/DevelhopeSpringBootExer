package DevelhopeSpringBootExercises.ControllerPathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Exer1MealsGetMapping {
    @GetMapping ("/meals")
    public List meals(){
        List<Meals> meal = new ArrayList<>();
        meal.add(new Meals("ugali", "stable food"));
        meal.add(new Meals("Sweetpotatoes", "breakfast"));
        return meal;
    }
}

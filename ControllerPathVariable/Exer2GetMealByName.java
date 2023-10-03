package DevelhopeSpringBootExercises.ControllerPathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class Exer2GetMealByName {
    private List<Meals> meal = Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    );
    @GetMapping("/meal/{name}")
    ResponseEntity<Meals> getMealByName(@PathVariable("name") String name){
        Optional<Meals> foundMeal = meal.stream()
                .filter(meal -> meal.getName().equalsIgnoreCase(name)).findFirst();

        if (foundMeal.isPresent()) {
            return ResponseEntity.ok(foundMeal.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}

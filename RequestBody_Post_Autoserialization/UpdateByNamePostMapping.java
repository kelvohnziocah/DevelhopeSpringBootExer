package DevelhopeSpringBootExercises.RequestBody_Post_Autoserialization;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UpdateByNamePostMapping {
    private List<Meals> meal = new ArrayList<>(Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    ));
    @PostMapping("/meal/{name}")
    ResponseEntity<Meals> updateByName(@PathVariable("name") String name, @RequestBody Meals updatedMeal){
        Meals MealExists = null;
        for (Meals meal : meal) {
            if (meal.getName().equalsIgnoreCase(name)) {
                MealExists = meal;
                break;
            }
        }

        if (MealExists != null) {
            // Update the existing meal with the information from the updatedMeal
            MealExists.setName(updatedMeal.getName());
            MealExists.setDescription(updatedMeal.getDescription());
            MealExists.setPrice(updatedMeal.getPrice());

            return ResponseEntity.ok(MealExists);
        } else {
            // Meal not found, you can handle this case accordingly (e.g., return a not found response)
            return null;
        }
    }
}


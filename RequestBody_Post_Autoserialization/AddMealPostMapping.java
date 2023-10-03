package DevelhopeSpringBootExercises.RequestBody_Post_Autoserialization;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class AddMealPostMapping {
    private List<Meals> meal = new ArrayList<>(Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    ));
    @GetMapping("/meal")
    ResponseEntity<List<Meals>> getMeal(){
        return ResponseEntity.ok(meal);
    }
    @PostMapping("/meal")
    ResponseEntity<String> addMeal (@RequestBody Meals newMeal){
        meal.add(newMeal);
        return ResponseEntity.ok("Meal added successfully");
    }
}

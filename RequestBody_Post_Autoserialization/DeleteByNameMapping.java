package DevelhopeSpringBootExercises.RequestBody_Post_Autoserialization;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestController
public class DeleteByNameMapping {
    private List<Meals> meal = new ArrayList<>(Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    ));

    @DeleteMapping("/meal/{name}")
    public ResponseEntity<String> deleteByName(@PathVariable("name") String name) {
        Iterator<Meals> iteratorMeal = meal.iterator();
        while (iteratorMeal.hasNext()) {
            Meals meal = iteratorMeal.next();
            if (meal.getName().equalsIgnoreCase(name)) {
                iteratorMeal.remove();
                return ResponseEntity.ok("deleted successfully");
            }
        }
        return ResponseEntity.notFound().build();
    }
}
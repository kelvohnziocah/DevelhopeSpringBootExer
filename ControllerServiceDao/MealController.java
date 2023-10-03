package DevelhopeSpringBootExercises.ControllerServiceDao;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MealController {
    private MealService mealService;
    @Autowired
    MealController(MealService mealService){
        this.mealService =  mealService;
    }
    @GetMapping("/meal")
    ResponseEntity<List<Meals>> getMeal(){
        return ResponseEntity.ok(mealService.getAllMeals());
    }
    @PostMapping("/meal/{name}")
    ResponseEntity<Meals> updateByName(@PathVariable("name") String name, @RequestBody Meals updatedMeal) {
       //return ResponseEntity.ok(mealService.updateMealByName(updatedMeal));

    }
    @PutMapping("/meal")
    ResponseEntity<String> addMeal (@RequestBody Meals newMeal){
        mealService.addMeal(newMeal);
        return ResponseEntity.ok("Meal added successfully");
    }
    @DeleteMapping("/meal/{name}")
    public ResponseEntity<String> deleteByName(@PathVariable("name") String name) {
        mealService.deleteMeal(name);
        return ResponseEntity.ok("Meal deleted successfully");
    }
}

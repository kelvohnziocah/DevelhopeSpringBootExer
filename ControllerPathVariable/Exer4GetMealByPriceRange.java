package DevelhopeSpringBootExercises.ControllerPathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Exer4GetMealByPriceRange {
    private List<Meals> meal = Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    );
    @GetMapping("/meal/price")
    public ResponseEntity<List<Meals>> getMealByPriceRange(@RequestParam("min") double minPrice, @RequestParam("max") double maxPrice){
        List<Meals> MealsWithinRange = meal.stream()
                .filter(meal -> meal.getPrice() >= minPrice && meal.getPrice() <= maxPrice)
                .collect(Collectors.toList());

        if (MealsWithinRange.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(MealsWithinRange);
        }
    }
}

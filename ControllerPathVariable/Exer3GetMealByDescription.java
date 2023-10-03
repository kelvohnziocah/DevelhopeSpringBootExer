package DevelhopeSpringBootExercises.ControllerPathVariable;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class Exer3GetMealByDescription {
    private List<Meals> meal = Arrays.asList(
            new Meals("ugali", "stable food", 40.00),
            new Meals("Sweetpotatoes", "breakfast", 50.80),
            new Meals("hotdog", "lunch meal", 150.00)
    );
    @GetMapping("/meal/description-match/{phrase}")
    public ResponseEntity<Meals> getMealByDescription (@PathVariable("phrase") String phrase){
        String formattedPhrase = phrase.toLowerCase();
        Optional<Meals> foundMealDescription = meal.stream()
                .filter(meal -> {
                    String[] wordsInDescription = meal.getDescription().toLowerCase().split("\\s+");
                    for (String word : wordsInDescription) {
                        if (word.contains(formattedPhrase)) {
                            return true;
                        }
                    }
                    return false;
                }).findAny();
        if(foundMealDescription.isPresent()){
            return ResponseEntity.ok(foundMealDescription.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}

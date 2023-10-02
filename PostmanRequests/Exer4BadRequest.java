package DevelhopeSpringBootExercises.PostmanRequests;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Exer4BadRequest {
    @GetMapping ("/random")
    ResponseEntity<String> randomBoolean() {
        boolean randomBoolean = new Random().nextBoolean();
        if (randomBoolean == true) {
            return ResponseEntity.ok("200 OK");
        } else {
            return ResponseEntity.badRequest().body("400 Bad Request");
        }
    }
}

package DevelhopeSpringBootExercises.PostmanRequests;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exer2GetMappingRequestEntity {
    @GetMapping("/greeting")
    ResponseEntity <String> greeting(){
        String greetings = "Good Afternoon Patrick";
        return ResponseEntity.ok(greetings);
    }

}

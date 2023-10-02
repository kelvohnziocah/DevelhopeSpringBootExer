package DevelhopeSpringBootExercises.PostmanRequests;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exer3GetMappingReturnResponseEntirty {
    @GetMapping("/info")
    ResponseEntity<String> getInfo(){
        String info = "Username is KNS and The password is $#@@#$$";
        return ResponseEntity.ok(info);
    }
}

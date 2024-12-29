package gb.example.cloud_services_app.service_a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public String getUser() {
        return "John Doe, 25 years old";
    }
}

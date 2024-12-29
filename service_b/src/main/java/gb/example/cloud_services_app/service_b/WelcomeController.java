package gb.example.cloud_services_app.service_b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    private final RestTemplate restTemplate;

    public WelcomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/welcome")
    public String getWelcomeMessage() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-a");
        String url = serviceInstance.getUri().toString() + "/user";
        String user = restTemplate.getForObject(url, String.class);
        return "Welcome to our service! User info: " + user;
    }
}
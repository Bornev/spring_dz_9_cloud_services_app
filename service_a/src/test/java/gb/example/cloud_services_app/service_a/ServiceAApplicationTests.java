//package gb.example.cloud_services_app.servicea;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.client.RestTemplate;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@SpringBootTest
//class ServiceAApplicationTests {
//
//	@Autowired
//	private RestTemplate restTemplate;
//
//	@Test
//	void contextLoads() {
//		// Проверка загрузки контекста Service A
//	}
//
//	@Test
//	void testServiceRegistration() {
//		// Проверяем, что Service A успешно регистрируется в Eureka Server
//		String eurekaUrl = "http://localhost:8761/eureka/apps";
//		String response = restTemplate.getForObject(eurekaUrl, String.class);
//		assertThat(response).contains("SERVICE-A");
//	}
//}

package gb.example.cloud_services_app.service_a;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServiceAApplication.class)
public class ServiceAApplicationTests {

	@Test
	void contextLoads() {
	}
}
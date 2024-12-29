package gb.example.cloud_services_app.serviceb;

import gb.example.cloud_services_app.service_b.ServiceBApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ServiceBApplication.class)
class ServiceBApplicationTests {
	@Autowired
	private RestTemplate restTemplate;

	@Test
	void contextLoads() {
		// Проверка загрузки контекста Service B
	}

	// Убираем тест регистрации в Eureka, так как он требует работающего сервера
	@Test
	void testServiceRegistration() {
		// Проверяем, что Service B успешно регистрируется в Eureka Server
		String eurekaUrl = "http://localhost:8761/eureka/apps";
		String response = restTemplate.getForObject(eurekaUrl, String.class);
		assertThat(response).contains("SERVICE-B");
	}
}

package eng.eaa.eaaspringcache;

import eng.eaa.eaaspringcache.service.ProductService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class EaaSpringCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaaSpringCacheApplication.class, args);
	}

	@Bean
	ApplicationRunner runner (ProductService service){
		return args -> {
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID2: "+ service.getById(2L));
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID1: "+ service.getById(1L));
		};
	}

}

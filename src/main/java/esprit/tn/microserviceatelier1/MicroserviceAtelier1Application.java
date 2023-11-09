package esprit.tn.microserviceatelier1;

import esprit.tn.microserviceatelier1.entities.Condidat;
import esprit.tn.microserviceatelier1.repositories.CondidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroserviceAtelier1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAtelier1Application.class, args);
	}

	@Autowired
	private CondidatRepository condidatRepository;

	@Bean
	ApplicationRunner init(){

		return args -> {
			condidatRepository.save(
					new Condidat(
							"yacine",
							"khouini",
							"a"
					)
			);
			condidatRepository.findAll().forEach(System.out::println);
			System.out.println(condidatRepository.findAll());
		};

	}


}

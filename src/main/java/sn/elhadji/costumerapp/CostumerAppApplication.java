package sn.elhadji.costumerapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sn.elhadji.costumerapp.entities.Customer;
import sn.elhadji.costumerapp.repository.CustomerRepository;

@SpringBootApplication
public class CostumerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumerAppApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
//		return args -> {
//			customerRepository.save(Customer.builder().name("elhadji").email("elhadji6312@gmail.com").build());
//			customerRepository.save(Customer.builder().name("Mbaye").email("diop@gmail.com").build());
//			customerRepository.save(Customer.builder().name("sarr").email("sarr@gmail.com").build());
//		};
//	}

}

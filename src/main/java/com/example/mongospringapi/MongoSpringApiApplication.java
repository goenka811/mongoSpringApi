package com.example.mongospringapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class MongoSpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoSpringApiApplication.class, args);
	}
/*
	@Bean
	CommandLineRunner runner(PolicyRepository repository, MongoTemplate mongoTemplate) {
		return args -> {
			Address address = new Address(
					"Scotland",
					"Edinburgh",
					"EH12", "80 Henry Street"
			);
			Policy policy = new Policy(
					"RishSanj",
					"1234561",
					"Annual",
					address,
					List.of("GBP", "USD", "EUR"),
					BigDecimal.TEN,
					LocalDateTime.now(),
					LocalDateTime.now());

			//usingMongoTemplateAndQuery(repository, mongoTemplate, policy);
			repository.findPolicyByPolicyNumber("12345678").ifPresentOrElse( p -> {
				System.out.println(p + " already exists");
			}, () -> {
				System.out.println("Inserting policy "+ policy);
		//		repository.insert(policy);
			});
		};
	}

 */
@Bean
CommandLineRunner runner(ClientRepository repository, MongoTemplate mongoTemplate) {
	return args -> {

		Client client = new Client(
				"3456789876567",
				"Schultz Properties",
				"220 CCG comprehensive",
				LocalDateTime.now(),
				LocalDateTime.now(),
				List.of("Expired"),
				LocalDateTime.now());

		//usingMongoTemplateAndQuery(repository, mongoTemplate, policy);
		repository.findClientsByClientId("12345678").ifPresentOrElse( c -> {
			System.out.println(c + " already exists");
		}, () -> {
			System.out.println("Inserting policy "+ client);
			repository.insert(client);
		});
	};
}
	private void usingMongoTemplateAndQuery(PolicyRepository repository, MongoTemplate mongoTemplate, Policy policy){
	Query query = new Query();
			query.addCriteria(Criteria.where("policyNumber").

	is("12345678"));
	List<Policy> policies = mongoTemplate.find(query, Policy.class);
			if(policies.size()>1)

	{
		throw new IllegalStateException("Error document found with id" + "12345");
	}
			if(policies.isEmpty())

	{
		System.out.println("Inserting row:");
		repository.insert(policy);
	}else

	{
		System.out.println("Problem inserting row:" + policy);
	}
}
}

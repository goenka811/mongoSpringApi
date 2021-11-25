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
import java.util.ArrayList;
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
CommandLineRunner runner(GcmsRepository repository, MongoTemplate mongoTemplate) {
	return args -> {

	/*	Client client = new Client(
				"BDS BHP 298",
				"Festivals Insurance Alliance",
				"220 CCG comprehensive",
				LocalDateTime.now(),
				LocalDateTime.now(),
				List.of("In progress"),
				LocalDateTime.now(),
				"Expleo Tech",
				"", "", "", "");

		//usingMongoTemplateAndQuery(repository, mongoTemplate, policy);
		repository.findClientsByGcmsId("12345678").ifPresentOrElse( c -> {
			System.out.println(c + " already exists");
		}, () -> {
			System.out.println("Inserting policy "+ client);
			repository.insert(client);
		});
*/

		Gcms gcms = new Gcms("AUS",
				"Australia",
				"ISI",
				"Interstate Steamship Insurances Pty Ltd (USD)",
				"Single Parent Captive",
				"Mining, Metals & Minerals",
				"0000",
				"Interstate Steamship Insurances Pty Ltd (USD)"
				);

		//usingMongoTemplateAndQuery(repository, mongoTemplate, gcms);
		//System.out.println("Inserting gcms "+ gcms);
		//repository.insert(gcms);
		repository.findGcmsByDomicileCodeAndCompanyCode("AUS", "ISI").ifPresentOrElse( g -> {
			System.out.println(g + " already exists");
		}, () -> {
			System.out.println("Inserting gcms "+ gcms);
			repository.insert(gcms);
		});
	};
}
	private void usingMongoTemplateAndQuery(GcmsRepository repository, MongoTemplate mongoTemplate, Gcms gcms){
	//Query query = new Query();
	//		query.addCriteria(Criteria.where("DomicileCode").

	//is("12345678"));
	List<Gcms> gcms1 = new ArrayList<>();//mongoTemplate.find(query, Gcms.class);
			if(gcms1.size()>1)

	{
		throw new IllegalStateException("Error document found with id" + "12345");
	}
			if(gcms1.isEmpty())

	{
		System.out.println("Inserting row:");
		repository.insert(gcms);
	}else

	{
		System.out.println("Problem inserting row:" + gcms);
	}
}
}

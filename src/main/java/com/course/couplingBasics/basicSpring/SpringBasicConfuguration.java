package com.course.couplingBasics.basicSpring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age) {};

record Address(String area, String street) {};

record Identity(String name, int age, Address address) {};

@Configuration
public class SpringBasicConfuguration {

	@Bean
	public String name() {
		return "Harsh";
	}
	
	@Bean
	public int age() {
		return 10;
	}
	
	@Bean
	public Person person() {
		return new Person("Harsh", 10);
	}
	
	@Bean(name = "Address")
	@Primary
	public Address Address() {
		return new Address("Mumbai", "12");
	}

	@Bean
	@Qualifier("realAddress")
	public Address AddressQualifier() {
		return new Address("Navi mumbai", "34");
	}	
	@Bean(name = "addressL")
	public List<Address> AddressL() {
		return Arrays.asList(new Address("Mumbai", "12"));
	}
	
	@Primary
	@Bean(name = "personL")
	public List<Person> personL() {
		return Arrays.asList(new Person("Harsh", 12));
	}
	// method calling of beans
	@Bean
	public Identity identity() {
		return new Identity(name(), age(), Address());
	}
	
	// parameter calling of beans it should be done with the same name of parameters and beans defined in the beans annotation
	@Bean
	public Identity identity2(String name, int age, Address Address) {
		return new Identity(name, age, Address);
	}
	
	@Bean
	public Identity identity3UsingQualifier(String name, int age, @Qualifier("realAddress") Address address) {
		return new Identity(name, age, address);
	}
}

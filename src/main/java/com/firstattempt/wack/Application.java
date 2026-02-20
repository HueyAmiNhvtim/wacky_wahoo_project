package com.firstattempt.wack;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
/*
Bean: Basically standard Java class that follows specific conventions, kinda like the RAII pattern for C++
1. All private properties (use getters/setters)
2. A public no-arg constructor
3. Implements Serializable, meaning the objects can be written to streams, and hence files, object databases, etc.
*/

/*
* I think this is the main method for the whole thing.
* */
@SpringBootApplication // combines the annotations of Configuration, EnableAutoConfiguration, and ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Them beans provided by SpringBoot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);

			for (String beanName : beanNames) {
				System.out.println(beanName);
			}
		};
	}
}

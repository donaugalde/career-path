package donaugalde.careerpath.java8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * Sample class with main method in SpringBoot.
 * 
 * @author donaugalde
 *
 */
@SpringBootApplication
public class CarrerPathJava8Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarrerPathJava8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("dup - Hello world Java 8 with SpringBoot!");
	}

}

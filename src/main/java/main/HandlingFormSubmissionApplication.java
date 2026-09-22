package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HandlingFormSubmissionApplication {

    //TODO
    // - make only the unit visible on the web that the user selected; it shows atm all 3 units in the result

    // ./mvnw spring-boot:run start application
	// curl http://localhost:8080/

    public static void main(String[] args) {
        SpringApplication.run(HandlingFormSubmissionApplication.class, args);
    }
}

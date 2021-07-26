package info.setmy.stealer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StealerApplication {

    public static void main(final String[] args) {
        SpringApplication.run(StealerApplication.class, args);
        System.out.println("Hello world");
    }
}

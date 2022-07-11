package cl.recoders.directorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cl.recoders.directorio"})
public class DirectorioApplication {

    public static void main(String[] args) {
        SpringApplication.run(DirectorioApplication.class, args);
    }

}

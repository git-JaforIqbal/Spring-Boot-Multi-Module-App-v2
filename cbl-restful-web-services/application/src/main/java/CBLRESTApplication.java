import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cbl.*"})
@EntityScan(basePackages = {"com.cbl.*"})
@EnableJpaRepositories(basePackages = {"com.cbl.*"})
public class CBLRESTApplication {

    public static void main(String[] args) {
        SpringApplication.run(CBLRESTApplication.class);
    }
}

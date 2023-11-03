package dependancyInjection;

import com.myapp.di.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Person person(){
        return new Person();
    }
}

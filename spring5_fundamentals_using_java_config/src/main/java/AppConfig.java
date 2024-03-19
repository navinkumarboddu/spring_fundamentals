import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /**
     * Setter Injection
     *
    @Bean(name="speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        service.setRepository(getSpeakerRepository());
        return service;
    }*/

    /**
     * Constructor Injection
     */
    /**
     * Commenting as added @ComponentScan and @Service for SpeakerServiceImpl
     @Bean(name="speakerService")
     @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
     public SpeakerService getSpeakerService(){
         //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
         //service.setRepository(getSpeakerRepository());
         return service;
     }
     */

    /**
    * Commenting as added @ComponentScan and @Repository for HibernateSpeakerRepositoryImpl
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
    */

}


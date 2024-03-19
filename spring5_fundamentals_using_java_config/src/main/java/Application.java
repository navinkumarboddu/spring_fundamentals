import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        /**
         * Hardcoded Object creation
         * SpeakerService service = new SpeakerServiceImpl();
         */

        /**
         * Spring container managed beans
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SpeakerService service = context.getBean("speakerService", SpeakerService.class);
        System.out.println(service);

        System.out.println(service.findAll().getFirst().getFirstName());
        System.out.println(service.findAll().getFirst().getLastName());

        /*
        *  To check the scope for service object*/
        SpeakerService service2 = context.getBean("speakerService", SpeakerService.class);
        System.out.println(service2);
    }
}

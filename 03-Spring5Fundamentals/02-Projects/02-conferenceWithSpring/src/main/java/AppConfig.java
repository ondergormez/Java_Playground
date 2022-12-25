import com.example.repository.HibernateSpeakerRepositoryImpl;
import com.example.repository.SpeakerRepository;
import com.example.service.SpeakerService;
import com.example.service.SpeakerServiceImpl;
import com.example.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.example"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);

        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

    /*
    * No need for this. This is done by following;
    * @Service("speakerService")
    * public class SpeakerServiceImpl implements SpeakerService {
    */
    // @Bean(name = "speakerService")
    // @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    // // @Scope(value= BeanDefinition.SCOPE_PROTOTYPE)
    // public SpeakerService getSpeakerService() {
    //     // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
    //     SpeakerServiceImpl service = new SpeakerServiceImpl();
    //     // service.setRepository(getSpeakerRepository());
    //
    //     return service;
    // }

    /*
    * No need for this. This is done by following;
    * @Repository("speakerRepository")
    * public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    */
    // @Bean(name = "speakerRepository")
    // public SpeakerRepository getSpeakerRepository() {
    //     return new HibernateSpeakerRepositoryImpl();
    // }
}

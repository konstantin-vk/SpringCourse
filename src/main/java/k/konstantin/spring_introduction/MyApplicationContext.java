package k.konstantin.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("k.konstantin.spring_introduction")
//@PropertySource("myApp.properties")
@PropertySource("classpath:myApp.properties")
public class MyApplicationContext {

    @Bean
    @Scope("singleton")
    public Pet cat(){
        return new Cat();
    }

    @Bean
    @Scope("singleton")
    public Person person(){
        return new Person(cat());
    }


}

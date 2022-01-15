package k.konstantin.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class Dog implements Pet{
    public Dog(){
        System.out.println("CLASS: Dog()");
    }
    @Override
    public void say(){
        System.out.println("CLASS: Dog.say ()");
        System.out.println("Af-af");
    }

    //@PostConstruct
    public void init(){
        System.out.println("CLASS: Dog.init()");
    }

    //@PreDestroy
    public void destroy(){
        System.out.println("CLASS: Dog.destroy()");
    }
}

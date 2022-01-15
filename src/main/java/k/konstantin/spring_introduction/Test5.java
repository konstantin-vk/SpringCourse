package k.konstantin.spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationContext.class);
        //Person person = context.getBean("person" , Person.class);
        //person.callPet();
        Cat cat = context.getBean("cat",Cat.class);
        cat.say();
        Person person = context.getBean("person" , Person.class);
        person.callPet();
        System.out.println(person.getName());
        context.close();
    }
}

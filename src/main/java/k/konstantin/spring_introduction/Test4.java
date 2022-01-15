package k.konstantin.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("person" , Person.class);
        person.callPet();
        System.out.println(person.getName());

        context.close();

    }
}

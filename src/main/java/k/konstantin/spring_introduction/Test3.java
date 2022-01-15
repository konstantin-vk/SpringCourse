package k.konstantin.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat cat = context.getBean("cat" , Cat.class);
        cat.say();
        Dog dog = context.getBean("dog" , Dog.class);
        dog.say();

        context.close();

    }
}

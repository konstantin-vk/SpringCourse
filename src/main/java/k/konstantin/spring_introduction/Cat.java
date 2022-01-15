
package k.konstantin.spring_introduction;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet{
    public Cat(){
        System.out.println("CLASS: Cat()");
    }
    @Override
    public void say(){
        System.out.println("CLASS: Cat.say()");
        System.out.println("Meouuuuvvvv");
    }
}

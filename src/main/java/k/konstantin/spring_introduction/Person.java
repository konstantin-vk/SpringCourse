package k.konstantin.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Person {
    //@Autowired
    //@Qualifier("dog")
    private Pet pet;

    @Value("${person.name}")
    private String name;
    private int age;

    public Person(){
         System.out.println("CLASS: Person ()");
    }


    //@Autowired
    public Person(@Qualifier("dog") Pet pet){
        System.out.println("CLASS: Person (Pet)");
        this.pet = pet;
    }

    //@Autowired
    //@Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("CLASS: Person.setPet (Pet)");
        this.pet = pet;
    }

    public void callPet() {
        System.out.println("CLASS: Person.callPet ()");
        System.out.println("Come here you bloody creature");
        this.pet.say();

    }

    public String getName() {
        return this.name;
    }
}

package ua.hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person implements Performer {

    public Person(){}

    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Autowired
    @Qualifier("coffeeMachine")
    private Machine machine;

    public void setMachine(Machine machine){
        this.machine = machine;
    }

    public void perform(){
        System.out.println("Hello! My name is " + name + "! I'm " + age + " years old.");
        System.out.println("It's 6 o'clock!!! Oh my god, i just wanna sleep...");
        System.out.println("But I have a coffee machine! Let's turn it on.");
        machine.work();
        System.out.println("Thanks god, now I can exist!");
    }

}

package ua.hw;

import java.util.Collection;

public class ExtendedPerson extends Person {

    public ExtendedPerson(){}

    private Collection<Machine> machines;
    public void setMachines(Collection<Machine> machines){
        this.machines = machines;
    }


    public void perform(){
        System.out.println("Hello! My name is " + super.getName() + "! I'm " + super.getAge() + " years old. I'm old man.");
        System.out.println("It's 6 o'clock!!! Oh my god, i just wanna sleep...");
        System.out.println("But I have a coffee machine and a microwave! Let's turn them on.");
        for(Machine machine:machines){
            machine.work();
        }
        System.out.println("Thanks god, now I can exist!");
    }
}

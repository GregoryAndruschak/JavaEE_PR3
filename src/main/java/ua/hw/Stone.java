package ua.hw;

public class Stone implements Lazyness{
    private String s = "Guess today I'll do nothing...";
    public Stone(){};
    public void doNothing(){
        System.out.println(s);
    }
}

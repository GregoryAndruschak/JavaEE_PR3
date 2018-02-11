package ua.hw;

public class LazyStudent extends Student  {

    private Lazyness lazyness;
    public LazyStudent(Lazyness lazyness){
        super();
        this.lazyness = lazyness;
    }
    public LazyStudent(int avg_mark, Lazyness lazyness){
        super(avg_mark);
        this.lazyness = lazyness;
    }
    public void perform(){
        super.perform();
        System.out.println("But...");
        lazyness.doNothing();
    }
}

package ua.hw;

public class Student implements Performer {

    private int avg_mark = 91;
    public Student() {}
    public Student(int avg_mark){
        this.avg_mark = avg_mark;
    }

    @Override
    public void perform() {
        System.out.println("I am a good student! My average mark is " + avg_mark + "!");
    }
}

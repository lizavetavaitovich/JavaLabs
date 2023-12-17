package lab1.course2.group6.voitovich;

public class Cheese extends Food {
    public Cheese(){
        super ("Сыр");
    }

    public void consume(){
        System.out.println(this + " съеден");
    }
}

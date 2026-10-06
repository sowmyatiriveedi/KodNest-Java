package track.MO5.Encapsulation;
class Animal
{
    void eat()
    {
        System.out.println("animal eatting");
    }
    void sleep()
    {
        System.out.println("animal is sleeping");
    }

}
class Tiger extends Animal
{
    @Override 
    void eat()
    {
        System.out.println("tiger eatting");
    }
    /*void sleep()
    {
        System.out.println("animal is sleeping");
    }*/
}

public class Over {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        a.sleep();
        Tiger t=new Tiger();
        t.eat();
        t.sleep();
    }
    
}

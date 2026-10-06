package track.MO5.Encapsulation;
class Parent
{
    void disp1()
    {
        System.out.println("Parent 1");
    }
    void disp2()
    {
        System.out.println("Parent 2");
    }
}
class Child extends Parent{
    void disp3()
    {
        System.out.println("child");
    }
}
public class Mai {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.disp1();
        c1.disp2();
        c1.disp3();
        
    }
    
}

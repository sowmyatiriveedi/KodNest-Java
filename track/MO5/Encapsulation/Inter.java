package track.MO5.Encapsulation;
interface Shape
{
    public abstract void input();
    public abstract void disp();
}
class Square implements Shape{
    @Override 
    public void input()
    {
        System.out.println("input");
    }
    @Override 
    public void disp()
    {
        System.out.println("display");
    }
}
public class Inter {
    public static void main(String[] args)
    {
        Square s=new Square();
        s.input();
        s.disp();
        Shape r=new Square();
        r.input();
        r.disp();
    }

    
}

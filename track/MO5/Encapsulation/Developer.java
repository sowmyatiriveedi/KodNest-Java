package track.MO5.Encapsulation;
class Parent
{
    void work()
    {
        System.out.println("Developing");
    }
    void project()
    {
        System.out.println("develop project");
    }
}
class JavaDeveloper extends Parent
{
    @Override
    void work()
    {
        System.out.println(" java Developing");
    }
    @Override 
    void project()
    {
        System.out.println("develop java project");
    }

}
class PythonDeveloper extends Parent
{
    @Override
    void work()
    {
        System.out.println(" python Developing");
    }
    @Override 
    void project()
    {
        System.out.println("develop python project");
    }

}

public class Developer {
    public static void main(String[] args) {
        JavaDeveloper jd=new JavaDeveloper();
        accessMethod(jd);
        PythonDeveloper pd=new PythonDeveloper();
        accessMethod(pd);
    }
        public static void accessMethod(Parent p)
        {
            p.work();
            p.project();
        }

        
    }
    


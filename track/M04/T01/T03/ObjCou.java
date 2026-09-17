class Demo {
    static int co = 0;
    {
        co++;
    }
}

public class ObjCou {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println("obj" + Demo.co);

    }
}
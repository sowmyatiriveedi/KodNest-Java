package track.M04.T01.T03;
class Car{
    static void convertKmtoMiles()
    {
        System.out.println("Converting km to miles");
    }
    void calMile()
    {
        System.out.println("cal miles");
    }
}
public class Stat {
    public static void main(String[] args) {
        Car.convertKmtoMiles();
        Car n=new Car();
        n.convertKmtoMiles();
        n.calMile();
    
        
        
    }
    
}

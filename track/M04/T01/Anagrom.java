package track.M04.T01;
import java.util.*;
public class Anagrom {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        {
            System.out.println("Enter st1 and st2");
            String s1=s.next();
            String s2=s.next();
            if(s1.length()!=s2.length())
            {
                System.out.println("not anagram");
                return;
            }
            char a[]=s1.toCharArray();
            char b[]=s2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String so1=new String(a);
            String so2=new String(b);
            


        }
    }
    
}

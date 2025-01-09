import java.util.*;

class Strings
{
    public static void Update(String Str)
    {
        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }

    }

   
    
}

public class StringUpdate3 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();
        
        Strings obj = new Strings();

        obj.Update(Arr);

    }
}

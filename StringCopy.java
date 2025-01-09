import java.util.*;

class StringX
{
    String StrCpyX(String Src)
    {
        char c[] = Src.toCharArray();
        char d[] = new char[c.length];

        for(int i = 0; i < c.length; i++)
        {
            d[i] = c[i];
        }

        return new String(d);
        
    }
}

public class StringCopy {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the source string: ");
        String Arr = sobj.nextLine();

        StringX obj = new StringX();

        String Brr = obj.StrCpyX(Arr);

        System.out.println("Destination string is: "+Brr);
    }
}

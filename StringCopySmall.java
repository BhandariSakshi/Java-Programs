import java.util.*;

class StringX
{
    String StrCpySmallX(String Src)
    {
        char c[] = Src.toCharArray();
        char d[] = new char[c.length];

        for(int i = 0; i < c.length; i++)
        {
            if(c[i] >= 'a' && c[i] <= 'z')
            {
                d[i] = c[i];
            }
           
        }

        return new String(d);
        
    }
}

public class StringCopySmall {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the source string: ");
        String Arr = sobj.nextLine();

        StringX obj = new StringX();

        String Brr = obj.StrCpySmallX(Arr);

        System.out.println("Destination string is: "+Brr);
    }
}

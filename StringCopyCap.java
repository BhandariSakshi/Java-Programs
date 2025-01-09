import java.util.*;

class StringX
{
    String StrCpyCapX(String Src)
    {
        char c[] = Src.toCharArray();
        char d[] = new char[c.length];

        for(int i = 0; i < c.length; i++)
        {
            if(c[i] >= 'A' && c[i] <= 'Z')
            {
                d[i] = c[i];
            }
           
        }

        return new String(d);
        
    }
}

public class StringCopyCap {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the source string: ");
        String Arr = sobj.nextLine();

        StringX obj = new StringX();

        String Brr = obj.StrCpyCapX(Arr);

        System.out.println("Destination string is: "+Brr);
    }
}

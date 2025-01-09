import java.util.*;

class StringX
{
    public static String StringToggleX(String Str)
    {
        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if (c[i] >= 'a' && c[i] <= 'z') {
                
                c[i] = (char)(c[i] - 32);
            }
            else if (c[i] >= 'A' && c[i] <= 'Z') {
                
                c[i] = (char)(c[i] + 32);
            }
        }

        return new String(c);
    }
}

public class StringToggle {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        StringX obj = new StringX();

        String sRet = obj.StringToggleX(Arr);
        System.out.println("Updated string is: "+sRet);

    }
}

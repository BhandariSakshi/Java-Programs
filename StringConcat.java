import java.util.*;

class StringX
{
    public static String StrCatX(String First, String Second)
    {
        char F[] = First.toCharArray();
        char S[] = Second.toCharArray();

        char result[] = new char[F.length + S.length];

        for(int i = 0; i < F.length; i++)
        {
            result[i] = F[i];
        }
        for(int j = 0; j < S.length; j++)
        {
            result[F.length+j] = S[j];
        }
        
        return new String(result);
    }
}

public class StringConcat {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the second String: ");
        String Brr = sobj.nextLine();

        StringX obj = new StringX();

        String Dest = obj.StrCatX(Arr, Brr);

        System.out.println("Destination string is: "+Dest);

    }
}

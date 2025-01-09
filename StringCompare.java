import java.util.*;

class StringX
{
    public static boolean StrCmpX(String First, String Second)
    {
        char F[] = First.toCharArray();
        char S[] = Second.toCharArray();

        if (F.length != S.length) {
            
            return false;
        }

        for(int i = 0; i < F.length && i < S.length; i++)
        {
            if (F[i] != S[i]) {
                
                return false;
            }
        }

        return true;
    }
}

public class StringCompare {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first String: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the second String: ");
        String Brr = sobj.nextLine();

        StringX obj = new StringX();

        boolean bRet = obj.StrCmpX(Arr, Brr);

        if (bRet == true) {
            
            System.out.println("Strings are identical");
        }
        else
        {
            System.out.println("Strings are not identical");
        }

    }
}

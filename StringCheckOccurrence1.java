import java.util.*;

class Strings
{
    public static boolean CheckOccurence(String Str)
    {
        boolean bFlag = false;

        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if (c[i] == 'w' || c[i] == 'W') {
                
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

public class StringCheckOccurrence1 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        boolean bRet = obj.CheckOccurence(Arr);

        if (bRet == true) {
            
            System.out.println("Charecter is present");
        }
        else
        {
            System.out.println("Charecter is not present");
        }
    }
}

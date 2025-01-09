import java.util.*;

class Strings
{
    public static boolean CheckOccurence(String Str, char ch)
    {
        boolean bFlag = false;

        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if (c[i] == ch) {
                
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

public class StringCheckOccurrence2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the charecter which you want to search: ");
        char cValue = sobj.next().charAt(0);

        Strings obj = new Strings();

        boolean bRet = obj.CheckOccurence(Arr, cValue);

        if (bRet == true) {
            
            System.out.println("Charecter is present");
        }
        else
        {
            System.out.println("Charecter is not present");
        }
    }
}

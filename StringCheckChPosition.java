import java.util.*;

class Strings
{
    public static int CheckPosition(String Str, char ch)
    {
        int iCount = 1;
        boolean bFlag = false;

        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if (c[i] == ch) {
                
                bFlag = true;
                break;
            }
            iCount++;
        }

        if (bFlag == true) {
            
            return iCount;
        }
        else
        {
            return -1;
        }
    }
}

public class StringCheckChPosition {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the charecter of which you want to find frequency of: ");
        char cValue = sobj.next().charAt(0);

        Strings obj = new Strings();

        int iRet = obj.CheckPosition(Arr, cValue);

        if (iRet == -1) {
            
            System.out.println("Charecter not found");
        }

        else
        {
            System.out.println("Position of charecter is: "+iRet);
        }
    }
}

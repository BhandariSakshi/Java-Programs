import java.util.*;

class Strings
{
    public static int CheckLastOcc(String Str, char ch)
    {
        char c[] = Str.toCharArray();

        int iCount = 1, iPos = -1;

        for(int i = 0; i < c.length; i++,iCount++)
        {
            if (c[i] == ch) {
                
                iPos = iCount;
            }
        }
        return iPos;
    }
}

public class StringCheckLastOccCh {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the charecter: ");
        char cValue = sobj.next().charAt(0);

        Strings obj = new Strings();

        int iRet = obj.CheckLastOcc(Arr, cValue);

        if (iRet != -1) {
            
            System.out.println("Last occurrence of Charecter is: "+iRet);
        }

        else
        {
            System.out.println("No such charecter present");
        }
    }

}

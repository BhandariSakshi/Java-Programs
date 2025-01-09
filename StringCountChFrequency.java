import java.util.*;

class Strings
{
    public static int CountFrequency(String Str, char ch)
    {
        int iCount = 0;

        char c[] = Str.toCharArray();

        for(int i = 0; i < c.length; i++)
        {
            if (c[i] == ch) {
                
                iCount++;
            }
            
        }

        return iCount;
    }
}

public class StringCountChFrequency {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the charecter of which you want to find frequency of: ");
        char cValue = sobj.next().charAt(0);

        Strings obj = new Strings();

        int iRet = obj.CountFrequency(Arr, cValue);

        System.out.println("Frequency of charecter is: "+iRet);
    }
}

import java.util.*;

class Strings
{
    public static int CountSpaces(String Str)
    {
        int iCount = 0;

        char ch[] = Str.toCharArray();

        for(int i = 0; i < ch.length; i++)
        {
            if (ch[i] == ' ') {
                
                iCount++;
            }
        }
        return iCount;
    }
}

public class StringCountWhitespaces {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        int iRet = obj.CountSpaces(Arr);
        System.out.println("Number of spaces are: "+ iRet);
    }
}

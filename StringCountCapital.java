import java.util.*;

class Strings
{
    public static int CountCapital(String Str)
    {
        char ch[] = Str.toCharArray();
        int iCount = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                
                iCount++;
            }
        }

        return iCount;
    }
}

public class StringCountCapital
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        int iRet = obj.CountCapital(Arr);
        System.out.println("Number of capital letters are: "+iRet);
    }
}

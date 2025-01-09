import java.util.*;

class Strings
{
    public static int CountSmall(String Str)
    {
        char ch[] = Str.toCharArray();
        int iCount = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if (ch[i] >= 95 && ch[i] <= 122) {
                
                iCount++;
            }
        }

        return iCount;
    }
}

public class StringCountSmall2
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        int iRet = obj.CountSmall(Arr);
        System.out.println("Number of small letters are: "+iRet);
    }
}

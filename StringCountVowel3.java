import java.util.*;

class Strings
{
    public static int CountVowel(String Str)
    {
        char ch[] = Str.toCharArray();

        int iCount = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') 
            {
                iCount++;
            }
        }

        return iCount;

    }

}

public class StringCountVowel3 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        int iRet = obj.CountVowel(Arr);
        System.out.println("Number of vowels are: "+iRet);
    }
}

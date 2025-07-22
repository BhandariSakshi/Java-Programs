import java.util.*;

public class CodeForce118A {

    public static boolean isVowel(char c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')
        {
            return true;
        }
        return false;
    }

    public static String Solution(String str)
    {
        String s = str.toLowerCase();
        char Arr[] = s.toCharArray();

        String res = "";

        for(char c : Arr)
        {
            if(!isVowel(c))
            {
                res = res +'.';
                res = res + c;
            }
        }

        return res;

    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        String str = sobj.nextLine();

        String Result = Solution(str);

        System.out.println(Result);

    }
}

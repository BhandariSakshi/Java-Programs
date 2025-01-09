import java.util.*;

class Strings
{
    public static void Reverse(String Str)
    {
        char c[] = Str.toCharArray();

        int Start = 0;
        int End = c.length-1;

        while(Start < End)
        {
            char temp = c[Start];
            c[Start] = c[End];
            c[End] = temp;

            Start++;
            End--;
        }

        String reversedStr = new String(c);

        System.out.println("Reversed String: " + reversedStr);
    }
}

public class StringReverse {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        obj.Reverse(Arr);
    }
}

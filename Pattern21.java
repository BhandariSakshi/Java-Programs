import java.util.*;

class Pattern{

    public static void Display(int iNo)
    {
        int i = 0;
        char ch = '\0';

        for(i = 1,ch = 'a'; i <= iNo; i++, ch++)
        {
            System.out.print(ch+"\t");
        }
    }
}

public class Pattern21
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}
import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        int i = 0;
        char ch = 'A';

        if (iNo < 1) {
            
            iNo = -iNo;
        }
        for(i = 1; i <= iNo; i++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
    }
}

public class Pattern18 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}

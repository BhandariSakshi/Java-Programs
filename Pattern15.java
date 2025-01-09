import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        int i = 0;

        if (iNo < 1) {
            
            iNo = -iNo;
        }
        for(i = -iNo; i <= -1; i++)
        {
            System.out.print(i+"\t");
        }
    }
}

public class Pattern15 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}

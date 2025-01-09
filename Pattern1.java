// * * * * *
import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        if (iNo < 0) {
            
            iNo = - iNo;
        }
        int i = 0;
        for(i = 1; i <= iNo; i++)
        {
            System.out.print("*\t");
        }
    }
}

class Pattern1
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}
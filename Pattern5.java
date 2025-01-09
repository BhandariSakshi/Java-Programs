import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        if (iNo < 0) {
            
            iNo = -iNo;
        }
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print("&\t");
        }
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print("*\t");
        }
    }
}

class Pattern5
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}
import java.util.*;

class Number
{
    public void Display(int iNo)
    {
        System.out.println("Decimal number: " + iNo);
        System.out.println("Octal number: " + Integer.toOctalString(iNo));
        System.out.println("Hexadecimal number: " + Integer.toHexString(iNo));
    }
}

public class NumberSystemDisplay
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Number obj = new Number();

        obj.Display(iValue);
    }
}
import java.util.*;

class Bitwise
{
    public static int And(int iNo1, int iNo2)
    {
        int iResult = 0;

        iResult = iNo1 & iNo2;

        return iResult;
    }
}

public class BitwiseAnd
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int iValue2 = sobj.nextInt();

        Bitwise obj = new Bitwise();

        int iRet = obj.And(iValue1, iValue2);
        System.out.println("Bitwise and of number is: "+iRet);
    }
}
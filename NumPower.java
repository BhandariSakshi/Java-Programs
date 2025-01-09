import java.util.*;

class Number{

    public static int Find(int iNo, int iPow) 
    {
    
        int iMul = 1;

        while(iPow > 0)
        {
            iMul = iMul*iNo;

            iPow--;

        }

        return iMul;
    }
}

public class NumPower {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        System.out.println("Enter he value of power: ");
        int iPower = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.Find(iValue, iPower);
        System.out.println("Value is: "+iRet);

    }
}

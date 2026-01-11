import java.util.*;

class HighestCommonFactor{

    public static int getHcf(int iNum1, int iNum2)
    {
        if(iNum1 == 0)
        {
            return iNum2;
        }
        if(iNum2 == 0)
        {
            return iNum1;
        }
        if(iNum1 == iNum2)
        {
            return iNum1;
        }
        if(iNum1 > iNum2)
        {
            return getHcf(iNum1-iNum2, iNum2);
        }
        else{
            return getHcf(iNum1, iNum2-iNum1);
        }
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int Num1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int Num2 = sobj.nextInt();

        int iRet = getHcf(Num1, Num2);

        System.out.println("Highest common factor is: "+iRet);
    }
}
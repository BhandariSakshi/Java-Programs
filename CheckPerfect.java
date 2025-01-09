import java.util.*;

class PerfectNum
{
    public boolean Check(int iNo)
    {
        int i = 0, iSum = 0;
        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo % i == 0) {
                
                iSum += i;
            }
        }
        if (iSum == iNo) {
            
            return true;
        }
        else
        {
            return false;
        }
    }
}

class CheckPerfect
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        boolean bRet = false;

        PerfectNum obj = new PerfectNum();

        bRet = obj.Check(iValue);

        if (bRet == true) {
            
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is not a perfect number");
        }
    }
}
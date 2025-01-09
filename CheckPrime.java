import java.util.*;

class Prime
{
    public boolean Check(int iNo)
    {
        boolean bFlag = true;

        for(int i = 2; i <= iNo/2; i++)
        {
            if (iNo % i == 0) {
                
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}

class CheckPrime
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Prime obj = new Prime();

        boolean bRet = false;

        bRet = obj.Check(iValue);

        if (bRet == true) {
            
            System.out.println("It is a prime number");
        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
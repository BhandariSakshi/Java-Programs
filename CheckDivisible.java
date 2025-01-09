import java.util.*;

class CheckDivisibility
{
       public boolean Check(int iNo)
        {
            if ((iNo % 3 == 0) && (iNo % 5 == 0)) {
                
                return true;
            }
            else
            {
                return false;
            }
            
        }
};

class CheckDivisible
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        CheckDivisibility obj = new CheckDivisibility();

        boolean bRet = false;

        bRet = obj.Check(iValue);

        if (bRet == true) {
            System.out.println("It is divisible by 3 and 5");
        }
        else
        {
            System.out.println("It is not divisible by 3 and 5");
        }


    }
}

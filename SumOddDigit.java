import java.util.*;

class Digit{

    public static int Sum(int iNo)
        {
            int iSum = 0, iDigit = 0;

            while (iNo != 0) {
                
                iDigit = iNo % 10;

                if (iDigit % 2 != 0) {
                    
                    iSum = iSum + iDigit;
                }
                iNo = iNo / 10;
            }
            return iSum;
        }
}

class SumOddDigit
{
    
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Digit obj = new Digit();

        int iRet = obj.Sum(iValue);

        System.out.println("Sum of odd numbers: "+iRet);
    }
}
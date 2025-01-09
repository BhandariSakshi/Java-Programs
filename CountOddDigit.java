import java.util.*;

class OddDigit
{
    public static int Count(int iNo)
    {
        int iDigit = 0, iCnt = 0;

        while (iNo > 0) {
            
            iDigit = iNo % 10;
            if (iDigit % 2 != 0) {
                iCnt++;
            }
            iNo = iNo / 10;
        }
        return iCnt;
    }
}

class CountOddDigit{

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        OddDigit obj = new OddDigit();
        
        int iRet = 0;

       iRet = obj.Count(iValue);

       System.out.println("Number of odd digits: "+iRet);

    }
}
import java.util.*;

class Number
{
    public static int CountOne(int iNo)
    {
        int iDigit = 0, iCount = 0;

        while (iNo != 0) {
            
            iDigit = iNo % 2;
            if(iDigit == 1)
            {
                iCount++;
            }
            iNo = iNo / 2;
        }
        return iCount;
    }
}

public class BinaryCountDigit {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.CountOne(iValue);
        System.out.println("Number of ones are: "+iRet);
    }
}

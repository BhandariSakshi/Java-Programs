import java.util.*;
class Digits
{
    public void Display(int iNo)
    {
        int iDigit = 0;

        while (iNo != 0) {
            
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
    public int Count(int iNo)
    {
        int iCount = 0;

        while (iNo != 0) {
            
            iCount++;
            iNo = iNo / 10;
        }

        return iCount;
    }
}

public class CountDigits {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Digits obj = new Digits();

        obj.Display(iValue);

        int iRet = 0;
        iRet = obj.Count(iValue);

        System.out.println("Number of digits are: "+iRet);

    }
    
}

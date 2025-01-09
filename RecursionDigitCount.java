import java.util.*;

public class RecursionDigitCount{

    static int CountDigit(int iNo, int iCount) {
        if (iNo > 0) { 
            iNo = iNo / 10; 
            iCount++;
            return CountDigit(iNo, iCount); 
        }
        return iCount; 
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iRet = CountDigit(iValue,0);
        System.out.println("Number of digits: "+iRet);
    }
}

import java.util.*;

public class RecursionDigitSum{

    static int SumDigit(int iNo, int iSum) {
        if (iNo > 0) { 
            iSum = iSum + (iNo % 10); 
            iNo = iNo / 10; 
            return SumDigit(iNo, iSum); 
        }
        return iSum; 
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        int iRet = SumDigit(iValue,0);
        System.out.println("Sum of digits: "+iRet);
    }
}

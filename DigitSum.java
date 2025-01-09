import java.util.*;

class Digits{

    public static int Sum(int iNo)
    {
        int iSum = 0;

        while (iNo != 0) {
            
            iSum = iSum + (iNo%10);
            iNo = iNo / 10;
        }
        return iSum;
    }

}

class DigitSum{

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.Sum(iValue);

        System.out.println("Sum of digits: "+iRet);
    }
}
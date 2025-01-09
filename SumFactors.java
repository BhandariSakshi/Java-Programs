import java.util.*;

class Sum
{
    public int FactorsSum(int iNo)
    {
        int iSum = 0, i = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo % i == 0) {
                
                iSum += i;
            }
        }
        return iSum;
    }
}

public class SumFactors {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Sum obj = new Sum();

        int iRet = 0;

        iRet = obj.FactorsSum(iValue);

        System.out.println("Sum of Factors are: "+iRet);


    }
}

import java.util.*;

class FactorsCount
{
    public int Count(int iNo)
    {
        int iCount = 0, i = 0;

        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo % i == 0) {
                
                iCount++;
            }
        }
        return iCount;
    }
}

class CountFactors
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        FactorsCount obj = new FactorsCount();

        int iRet = obj.Count(iValue);

        System.out.println("Number of factors are: "+iRet);
    }
}
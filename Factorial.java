import java.util.*;

class FindFactorial
{
    public int Find(int iNo)
    {
        int iFact = 1, i = 0;

        for(i = 1; i <= iNo; i++)
        {
            iFact = iFact * i;
        }

        return iFact;
    }
}

class Factorial
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        FindFactorial obj = new FindFactorial();

        int iRet = 0;

        iRet = obj.Find(iValue);

        System.out.println("Factorial is: "+iRet);


    }
}
import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int Arr[] = null;

    ArrayX(int iNo)
    {
        System.out.println("Inside constructor");
        iSize = iNo;

        Arr = new int[iNo];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;

        System.out.println("Enter elements: ");

        for(i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void DisplayCountDigits()
    {
        int i = 0, iRet = 0;
        for(i = 0; i < iSize; i++)
        {
            iRet = CalculateDigits(Arr[i]);

            System.out.println(Arr[i]+" conatins "+iRet+" digits");
        }
    }

    int CalculateDigits(int iValue)
    {
        int iCount = 0;

        while (iValue != 0) {
            
            iCount++;
            iValue = iValue / 10;
        }

        return iCount;
    }
}

public class ArrCountDigit {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elemnts you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.DisplayCountDigits();
    }
}

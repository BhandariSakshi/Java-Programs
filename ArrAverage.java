import java.util.*;

class ArrayX
{
    public int Arr[] = null;
    public int iSize = 0;

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

        System.out.println("Enter the elements: ");
        for(i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    float Average()
    {
        int i = 0;
        float fSum = 0.0f;

        for(i = 0; i < iSize; i++)
        {
            fSum = fSum + Arr[i];
        }

        return (fSum / iSize);
    }
}

public class ArrAverage {

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of digits you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();

        float fRet = obj.Average();
        System.err.println("Value is: "+fRet);
    }
}

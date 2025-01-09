import java.util.*;

class ArrayX
{
    public static int iSize = 0;
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
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int MaxSum()
    {
        int iMax = Arr[0];

        for(int Start = 0; Start < Arr.length; Start++)
        {
            int CurrSum = 0;

            for(int End = Start; End < Arr.length; End++)
            {
                CurrSum += Arr[End];

                if (iMax < CurrSum) {
                    
                    iMax = CurrSum;
                }
            }
        }

        return iMax;
    }

}

public class SubArrayMax {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();

        int iRet = obj.MaxSum();
        System.out.println("Maximum sum of subarray: "+iRet);

    }
}

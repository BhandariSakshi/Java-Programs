import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int Arr[] = null;

    ArrayX(int iNo)
    {
        System.out.println("Inside Constructor");
        iSize = iNo;

        Arr = new int[iNo];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int Xor()
    {
        int result = 0;

        for(int i = 0; i < iSize; i++)
        {
            int ans = CountBits(i+1);
            result ^= (Arr[i]+ans);
        }

        return result;
    }

    int CountBits(int x)
    {
        int Count = 0;

        while(x != 0)
        {
            Count += (x&1);
            x >>= 1;
        }

        return Count;
    }


}

public class ArrayXOR {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store in the array: ");
        int iCnt = sobj.nextInt();

        ArrayX obj = new ArrayX(iCnt);

        obj.Accept();
        int iRet = obj.Xor();

        System.out.println("Ans is: "+iRet);


    }
}

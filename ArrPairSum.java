import java.util.*;

class ArrayX
{
    public int Arr[] = null;
    public int iSize = 0;

    ArrayX(int iNo)
    {
        iSize = iNo;
        Arr = new int[iNo];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the elements: ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int[] PairSum(int iTarget)
    {
        int Result[] = new int[2];

        for(int i = 0; i < Arr.length; i++)
        {
            for(int j = i+1; j < Arr.length; j++)
            {
                if (Arr[i] + Arr[j] == iTarget) {
                    
                    Result[0] = i;
                    Result[1] = j;

                    return Result;
                }
            }
        }

        return null;
    }
}

public class ArrPairSum
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        
        ArrayX obj = new ArrayX(iCount);
        obj.Accept();

        System.out.println("Enter the target number: ");
        int Target = sobj.nextInt();

        int Result[] = obj.PairSum(Target);

        if (Result != null) {
            
            System.out.println("Element found at indices "+Result[0]+" "+Result[1]);
        }

        else
        {
            System.out.println("No pair found");
        }
    }
}

import java.util.*;

class ArrayX{

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

        System.out.println("Enter the elements: ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int MajorityElement()
    {
        
        int iFreq = 0, Max = 0;

        for(int i = 0; i < iSize; i++)
        {
            if (iFreq == 0) {
                
                Max = Arr[i];
            }

            if (Max == Arr[i]) {
                
                iFreq++;
            }
            else
            {
                iFreq--;
            }
        }
        return Max;
    }

}

public class MooresVotingAlgo
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        System.out.println("Majority element in the array is: "+obj.MajorityElement());
    }
}
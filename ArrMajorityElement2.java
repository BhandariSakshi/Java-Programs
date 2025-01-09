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

    void Sort()
    {
        Arrays.sort(Arr);
    }

    int MajorityElement()
    {
        int i = 0, iFreq = 1, Max = Arr[0];

        for(i = 1; i < Arr.length; i++)
        {
                if(Arr[i] == Arr[i-1])
                {
                    iFreq++;
                }
                else
                {
                    iFreq = 1;
                    Max = Arr[i];
                }
            

            if (iFreq > iSize/2) {
                
                return Max;
            }
        }
        return Max;
    }

}

public class ArrMajorityElement2
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.Sort();
        System.out.println("Majority element in the array is: "+obj.MajorityElement());
    }
}
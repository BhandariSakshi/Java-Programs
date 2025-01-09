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

        System.out.println("Enter the elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int Minimum()
    {
        int i = 0; 
        int iMin = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if (Arr[i] < iMin) {
                
                iMin = Arr[i];
            }
        }
        return iMin;
    }
}

class ArrMinNum{

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        
        int iRet = obj.Minimum();
        System.out.println("Minimum number is: "+iRet);
    }
}
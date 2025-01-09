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

    int Maximum()
    {
        int i = 0; 
        int iMax = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if (Arr[i] > iMax) {
                
                iMax = Arr[i];
            }
        }
        return iMax;
    }
}

class ArrMaxNum{

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        
        int iRet = obj.Maximum();
        System.out.println("Maximum number is: "+iRet);
    }
}
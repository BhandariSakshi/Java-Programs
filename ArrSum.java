import java.util.*;

class ArrayX
{
    public int Arr[];

    ArrayX(int no)
    {
        System.out.println("Inside constructor");
        Arr = new int[no];
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

    int Sum()
    {
        int iSum = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            iSum += Arr[i];
        }
        return iSum;
    }
}

class ArrSum
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();

        int iRet = obj.Sum();
        System.out.println("Sum is: "+iRet);
    }
}
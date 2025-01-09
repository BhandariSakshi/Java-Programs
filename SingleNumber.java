import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int Arr[] = null;

    ArrayX(int iNo)
    {
        System.out.println("Inside contructor");

        iSize = iNo;

        Arr = new int[iNo];
    }

    void Accept()
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int SingleNum()
    {
        int i = 0, iAns = 0;

        for(i = 0; i < Arr.length; i++)
        {
            iAns = iAns ^ Arr[i];
        }

        return iAns;
    }

}

public class SingleNumber {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();

        int iRet = obj.SingleNum();
        System.out.println("Single or unique number is: "+iRet);
    }
}

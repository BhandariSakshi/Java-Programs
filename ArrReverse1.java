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

    void Reverse()
    {
        int i = 0;

        System.out.println("Reversed array: ");
        for(i = Arr.length-1; i >= 0; i--)
        {
            System.err.print(Arr[i]+"\t");
        }
    }
}

public class ArrReverse1 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.Reverse();
    }
}

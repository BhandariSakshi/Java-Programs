import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int Arr[] = null;

    ArrayX(int iNo)
    {
        System.out.println("Inside constructor: ");

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

    void Display()
    {
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
           System.out.print(Arr[i]+"\t");
        }

        System.out.println();
    }

    void Reverse()
    {
        int iStart = 0, iEnd = 0, temp = 0;

        iEnd = iSize-1;

        while (iStart < iEnd) {
            
            temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = temp;

            iStart++;
            iEnd--;
        }
    }
}

public class ArrReverse2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        System.out.println("Array before reversing: ");
        obj.Display();
        obj.Reverse();
        System.out.println("Array after reversing: ");
        obj.Display();
    }
}

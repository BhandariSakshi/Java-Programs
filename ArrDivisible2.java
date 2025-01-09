import java.util.*;

class ArrayX
{
    public int Arr[];

    ArrayX(int iSize)
    {
        System.out.println("Inside constructor: ");
        Arr = new int[iSize];
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

    int Divisible()
    {
        int i = 0, iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if ((Arr[i] % 5 == 0) && (Arr[i] % 3 == 0)) {
                
                iCount++;
            }
        }

        return iCount;
    }
}

public class ArrDivisible2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();

        int iRet = 0;
        iRet = obj.Divisible();
        System.out.println("Number of elemnts divisible by 3 and 5 are: "+iRet);
    }
}

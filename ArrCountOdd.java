import java.util.*;

class ArrayX
{
    public int Arr[];

    ArrayX(int No)
    {
        System.out.println("Inside constructor");

        Arr = new int[No];
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

    int Count()
    {
        int iCount = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 != 0) {
                
                iCount++;
            }
        }
        return iCount;
    }
}

public class ArrCountOdd {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        int iRet = obj.Count();
        System.out.println("Number of Odd elements are: "+iRet);
    }
}
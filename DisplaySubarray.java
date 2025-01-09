import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int Arr[];

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

    void DisplaySubarray()
    {
        int i = 0, Start = 0, End = 0;

        System.out.println("Subarrays are: ");

        for(Start = 0; Start < Arr.length; Start++)
        {
            for(End = Start; End < Arr.length; End++)
            {
                for(i = Start; i <= End; i++)
                {
                    System.out.print(Arr[i]);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}

public class DisplaySubarray {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.DisplaySubarray();
    }
}

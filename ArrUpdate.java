import java.util.*;

class ArrayX
{
    public int Arr[];
    public int iSize;

    ArrayX(int iSize)
    {
        System.out.println("Inside constructor");
        Arr = new int[iSize];
    }

    void Accept()
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void Update()
    {
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i]++;
        }
    }

    void Display()
    {
        int i = 0;

        System.out.println("Array after updation: ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

}

public class ArrUpdate {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.Update();
        obj.Display();
    }
}

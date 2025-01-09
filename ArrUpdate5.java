import java.util.*;

class ArrayX
{
    public int iSize;
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

        System.out.println("Enter elements: ");
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
                
                Arr[i] = Arr[i]*2;
            
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

public class ArrUpdate5 {
    
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

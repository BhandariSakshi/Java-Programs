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

    void Display()
    {
        int i = 0;

        System.out.println("Entered elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }

    void OddDisplay()
    {
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if (Arr[i] % 2 != 0) {
                
                System.err.println(Arr[i]);
            }
        }
    }
}

public class ArrOddDisplay {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of element that you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        System.out.println("Odd numbers are: ");
        obj.OddDisplay();
    }
}

import java.util.*;

class Sort{

    public int Arr[];

    Sort(int iNo)
    {
        
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

    void sort()
    {
        int Selected, i = 0, j = 0;

    for (i = 0; i < Arr.length; i++)
    {
       
        for (j = i-1, Selected = Arr[i]; (j >= 0) && (Arr[j] > Selected); j--)
        {
           Arr[j+1] = Arr[j];
        }
        Arr[j+1] = Selected;
    }
    }

    void Display()
    {
        int i = 0;

        System.out.println("Array after sorting: ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
    }

}

public class InsertionSort {

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of element that you want to store: ");
        int iLength = sobj.nextInt();

        Sort obj = new Sort(iLength);

        obj.Accept();
        obj.sort();
        obj.Display();
    }
    
}

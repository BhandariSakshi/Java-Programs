import java.util.*;

class Sort
{
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
        int temp, i = 0, j = 0;
        boolean bFlag = true;

        for(i = 0; i < Arr.length-1 && bFlag == true; i++)
        {
            bFlag = false;

            for(j = 0; j < Arr.length-1-i; j++)
            {
                if (Arr[j] > Arr[j+1]) {

                    temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
                bFlag = true;
            }
        }
    }

    void Display()
    {
        int i = 0;

        System.out.println("Array after sorting: ");
        for(i = 0; i < Arr.length; i++)
        {
            System.out.print(Arr[i]+ "\t");
        }
    }
}

public class BubbleSortEfficent {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements that you want to store: ");
        int iLength = sobj.nextInt();

        Sort obj = new Sort(iLength);

        obj.Accept();
        obj.sort();
        obj.Display();


    }
}

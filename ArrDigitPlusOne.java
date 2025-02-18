import java.util.*;

class Solution
{
    public int []Arr = null;

    Solution(int iSize)
    {
        Arr = new int[iSize];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void PlusOne()
    {
        int n = Arr.length;

        for(int i = n-1; i >= 0; i--)
        {
            if(Arr[i] < 9)
            {
                Arr[i] += 1;
                return;
            }
            Arr[i] = 0;
        }
        int []newArray = new int[n+1];
        newArray[0] = 1;

        for(int i = 1; i < n; i++)
        {
            newArray[i] = Arr[i-1];
        }
        Arr = newArray;
    }

    void printArray()
    {
        System.out.println("Array After adding one: ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

public class ArrDigitPlusOne {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        Solution obj = new Solution(iCount);

        obj.Accept();
        obj.PlusOne();
        obj.printArray();

    }
}

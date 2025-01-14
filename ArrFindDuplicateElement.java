import java.util.*;

class ArrayX
{
    public int Arr[] = null;
    public int iSize = 0;

    ArrayX(int iCount)
    {
        iSize = iCount;

        Arr = new int[iCount];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    int FindDuplicate()
    {
        Arrays.sort(Arr);

        for(int i = 0; i < iSize; i++)
        {
            if (Arr[i] == Arr[i+1]) {
                
                return Arr[i];
            }
        }
        return -1;
    }
}


public class ArrFindDuplicateElement {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iLength = sobj.nextInt();

        ArrayX obj = new ArrayX(iLength);

        obj.Accept();
        int iRet = obj.FindDuplicate();

        if (iRet == -1) {
            
            System.out.println("There is no duplicate element: ");

        }
        else
        {
            System.out.println("Duplicate element is: "+iRet);
        }
    }
}

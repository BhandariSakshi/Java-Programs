import java.util.*;

public class ArrNumSearch2 {

    public static boolean Search(int ptr[], int iNo)
    {
        int i = 0;

        for(i = 0; i < ptr.length; i++)
        {
            if (ptr[i] == iNo) {
                break;
            }
        }
        if (i == ptr.length) {
            
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iCount = 0;
        System.out.println("Enter the number of elements that you want to store: ");
        iCount = sobj.nextInt();

        int Arr[] = null;

        Arr = new int[iCount];

        int i = 0;
        System.out.println("Enter the elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iValue = 0;
        System.out.println("Enter the number of which you want to find: ");
        iValue = sobj.nextInt();

        boolean bRet = false;

        bRet = Search(Arr, iValue);

        if (bRet == true) {
            
            System.out.println(iValue+" is present");
        }
        else
        {
            System.out.println(iValue+" is not present");
        }
    }
}

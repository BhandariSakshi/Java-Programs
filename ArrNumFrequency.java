import java.util.*;

public class ArrNumFrequency {

    public static int Count(int ptr[], int iNo)
    {
        int i = 0, iFrequency = 0;

        for(i = 0; i < ptr.length; i++)
        {
            if (ptr[i] == iNo) {
                
                iFrequency++;
            }
        }
        return iFrequency;
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
        System.out.println("Enter the number of which you want to find frequency: ");
        iValue = sobj.nextInt();

        int iRet = 0;

        iRet = Count(Arr, iValue);
        System.out.println(iValue+" is present "+iRet+" times");
        
    }
}

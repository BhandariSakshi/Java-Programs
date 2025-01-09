import java.util.*;

public class ArrDivisible {

    public static int Divisible(int ptr[])
    {
        int i = 0, iCount = 0;
        for(i = 0; i < ptr.length; i++)
        {
            if (ptr[i] % 5 == 0) {
                iCount++;
            }
        }
        return iCount;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int icount = 0;
        System.out.println("Enter the number of elements you want to store: ");
        icount = sobj.nextInt();

        int i = 0;
        int Arr[] = null;

        Arr = new int[icount];

        System.out.println("Enter the elements: ");
        for(i = 0; i < icount; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iRet = 0;
        iRet = Divisible(Arr);
        System.out.println("Number of elements divisible by 5 : "+iRet);
    }    
}

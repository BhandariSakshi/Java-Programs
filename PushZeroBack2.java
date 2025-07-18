import java.util.*;

public class PushZeroBack2 {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int iCount = sobj.nextInt();

        int Arr[] = null;

        Arr = new int[iCount];

        System.out.println("Enter the elements: ");
        for(int i = 0; i < iCount; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        for(int j = 0; j < Arr.length; j++) {
            for(int i = 0; i < Arr.length - 1; i++) {
                if(Arr[i] == 0 && Arr[i + 1] > 0) {
                    Arr[i] = Arr[i + 1];
                    Arr[i + 1] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(Arr));


    }
}

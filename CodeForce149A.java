import java.util.*;

public class CodeForce149A{

    public static int Solution(int Arr[], int k)
    {
         int count = 0, sum = 0;
        Arrays.sort(Arr);  
        if(k == 0)
        {
            return 0;
        }

        for (int i = Arr.length - 1; i >= 0; i--) { 
            sum += Arr[i];
            count++;

            if (sum >= k) {
                return count;  
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int k = sobj.nextInt();
        int Arr[] = new int[12];

        for(int i = 0; i < 12; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println(Solution(Arr,k));

    }
}
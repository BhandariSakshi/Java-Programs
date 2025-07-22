import java.util.*;

public class CodeForce144A {

    public static int Solution(int Arr[], int n)
    {
        int count = 0;
        int max = Arr[0], maxE = 0;
        int min = Arr[0], minE = 0;
          for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
                maxE = i;
            }
            if (Arr[i] <= min) { 
                min = Arr[i];
                minE = i;
            }
        }

       
       if(maxE > minE)
       {
        return maxE + n - minE -2;
       }
       else
       {
        return maxE + n - minE -1;
       }
        
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();

        int Arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        System.out.println(Solution(Arr,n));
    }
}

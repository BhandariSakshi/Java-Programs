import java.util.*;

public class CodeForce155A {

    public static int Solution(int Arr[])
    {
        int min = Arr[0];
        int max = Arr[0];
        int count = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if (Arr[i] > max) {
                count++;
                max = Arr[i];
            } else if (Arr[i] < min) {
                count++;
                min = Arr[i];
            }

            
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int num = sobj.nextInt();

        int Arr[] = new int[num];

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int Return = Solution(Arr);
        System.out.println(Return);
    }
}

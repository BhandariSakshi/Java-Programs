import java.util.*;

public class CodeForce318A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();
        int K = sobj.nextInt();

        int oddCount = (N+1)/2;

        if(K <= oddCount)
        {
            System.out.println(2*K-1);
        }
        else{
            long index = K - oddCount;
            System.out.println(2*index);
        }
        
    }
}

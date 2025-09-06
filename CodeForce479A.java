import java.util.*;

public class CodeForce479A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

       int A = sobj.nextInt();
       int B = sobj.nextInt();
       int C = sobj.nextInt();

       int iResult = Math.max(
            Math.max(A+B+C , A*B*C), 
            Math.max((A+B)*C , A*(B+C))
            );

       System.out.println(iResult);

       
    }
}

import java.util.*;

public class CodeForce61A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        String S1 = sobj.nextLine();
        String S2 = sobj.nextLine();

       StringBuilder result = new StringBuilder();

        for(int i = 0; i < S1.length(); i++)
        {
            if(S1.charAt(i) == S2.charAt(i))
            {
                result.append('0');
            }
            else{
                result.append('1');
            }
        }
       
        System.out.println(result);
    }
}

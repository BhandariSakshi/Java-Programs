import java.util.*;

public class CodeForce514A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

       String s = sobj.nextLine();

       String result = "";

       //4545

       for(int i = 0; i < s.length(); i++)
       {
            int digit = s.charAt(i)-'0';
            int n = 9-digit;

            if (i == 0 && n == 0) {      
                result += digit;
            } else {
                if (n < digit) {
                    result += n;
                } else {
                    result += digit;
                }
            }

       }

       System.out.println(result);

        
    }
}

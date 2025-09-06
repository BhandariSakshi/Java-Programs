import java.util.*;

public class CodeForce339A{

    public static void main(String[] args) {
        
        
        Scanner sobj = new Scanner(System.in);

        String s = sobj.nextLine();

        String []Digit = s.split("\\+");

        Arrays.sort(Digit);

        String result = String.join("+",Digit);

        System.out.println(result);
        
    }
}
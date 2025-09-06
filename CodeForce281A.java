import java.util.*;

public class CodeForce281A{

    public static void main(String[] args) {
        
        
        Scanner sobj = new Scanner(System.in);

        String s = sobj.nextLine();

        char Arr[] = s.toCharArray();

        Arr[0] = Character.toUpperCase(Arr[0]);


        System.out.println(new String(Arr));
        
    }
}
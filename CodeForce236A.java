import java.util.*;

public class CodeForce236A {

    public static void Solution(String name)
    {
        String seen = "";
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (seen.indexOf(ch) == -1) {
                seen += ch;
                count++;
            }
        }

        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        String name = sobj.nextLine();

        Solution(name);

    }
}

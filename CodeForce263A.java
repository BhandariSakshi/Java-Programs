import java.util.*;

public class CodeForce263A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int move = 0;

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                int v = sobj.nextInt();

                if(v == 1)
                {
                    move = Math.abs(i-3)+Math.abs(j-3);
                }
            }
        }
        System.out.println(move);
    }
}

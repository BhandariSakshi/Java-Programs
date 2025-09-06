import java.util.*;

public class CodeForce469A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int N = sobj.nextInt();
        Set<Integer> can = new HashSet<>();

        int P = sobj.nextInt();
        for(int i = 0; i < P; i++)
        {
            can.add(sobj.nextInt());
        }

        int Q = sobj.nextInt();
        for(int j = 0; j < Q; j++)
        {
            can.add(sobj.nextInt());
        }

        if(can.size() == N)
        {
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}

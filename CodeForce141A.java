import java.util.*;

public class CodeForces141A{
    public static void Solution(String guest, String resi, String pile)
    {
        
        String Add = guest + resi;

        char Arr[] = Add.toCharArray();
        char Brr[] = pile.toCharArray();

        Arrays.sort(Arr);
        Arrays.sort(Brr);

         if (Arrays.equals(Arr, Brr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        String guest = sobj.nextLine();

        String resi = sobj.nextLine();

        String pile = sobj.nextLine();

        Solution(guest, resi, pile);
    }
}
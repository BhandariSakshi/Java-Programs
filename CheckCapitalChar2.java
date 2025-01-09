import java.util.*;

class Charecter
{
    
        public static void Check(char ch)
        {
            if (ch >= 65 && ch <= 90) {
                System.out.println("It is Capital letter");
            }
            else
            {
                System.out.println("It is not capital letter");
            }
           
        }

}

public class CheckCapitalChar2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the charecter: ");
        char ch = sobj.next().charAt(0);

        Charecter obj = new Charecter();

        obj.Check(ch);
    }
}

import java.util.*;

class Charecter
{
    
        public static void Check(char ch)
        {
            if (ch >= 97 && ch <= 122) {
                System.out.println("It is small letter");
            }
            else
            {
                System.out.println("It is not small letter");
            }
           
        }

}

public class CheckSmallChar2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the charecter: ");
        char ch = sobj.next().charAt(0);

        Charecter obj = new Charecter();

        obj.Check(ch);
    }
}

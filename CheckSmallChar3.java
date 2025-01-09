import java.util.*;

class Charecter
{
    
        public static boolean Check(char ch)
        {
            if (ch >= 'a' && ch <= 'z') {
                return true;
            }
            else
            {
                return false;
            }
           
        }

}

public class CheckSmallChar3 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the charecter: ");
        char ch = sobj.next().charAt(0);

        Charecter obj = new Charecter();

        boolean bRet = obj.Check(ch);

        if (bRet == true) {
            
            System.out.println("It is small letter");
        }
        else
        {
            System.out.println("It is not small letter");
        }
    }
}

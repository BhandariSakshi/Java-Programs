import java.util.*;

class Charecter
{
    
        public static boolean Check(char ch)
        {
            boolean bFlag = false;

            if (ch >= 'A' && ch <= 'Z') {
                bFlag = true;
            }
            return bFlag;
           
        }

}

public class CheckCapitalChar4 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the charecter: ");
        char ch = sobj.next().charAt(0);

        Charecter obj = new Charecter();

        boolean bRet = obj.Check(ch);

        if (bRet == true) {
            
            System.out.println("It is capital letter");
        }
        else
        {
            System.out.println("It is not capital letter");
        }
    }
}

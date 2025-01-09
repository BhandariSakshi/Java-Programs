import java.util.*;

class CheckDigit{

    public static boolean Check(char ch)
    {
        if ((ch >= '0') && (ch <= '9')) {
            
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the digit: ");
        String cValue = sobj.nextLine();

        char A = cValue.charAt(0);

        boolean bRet = false;

        bRet = Check(A);

        if (bRet == true) {

            System.out.println("It is a digit");
            
        }
        else
        {
            System.out.println("It is not a digit");
        }
    }
}
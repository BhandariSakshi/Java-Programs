import java.util.*;

class Strings{

    public static int StrLenX(String Str)
    {
        char Arr[] = Str.toCharArray();

        int i = 0, iCnt = 0;

        for (i = 0; i < Arr.length; i++) {
            iCnt++;
        }
        return iCnt;

    }
}

public class StringLength {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String Arr = sobj.nextLine();

        Strings obj = new Strings();

        int iRet = obj.StrLenX(Arr);
        System.out.println("Length of string is: "+iRet);
    }
}

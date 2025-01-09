import java.util.*;
class Digits
{
    public void Display(int iNo)
    {
        int iDigit = 0;

        while (iNo != 0) {
            
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}

public class DisplayDigits {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Digits obj = new Digits();

        obj.Display(iValue);

    }
    
}

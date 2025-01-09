import java.util.*;

class Number
{
    public static void Display(int iNo)
    {
        int iDigit = 0;

        while (iNo != 0) {
            
            iDigit = iNo % 2;
            System.out.print(iDigit);
            iNo = iNo / 2;
        }
    }
}

public class BinaryDisplay {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Number obj = new Number();

        obj.Display(iValue);
    }
}

//1 * 2 * 3 * 4 * 5 *

import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        if (iNo < 0) {
            
            iNo = -iNo;
        }
        for(int i = 1; i <= iNo; i++)
        {
            System.out.print(i+"\t*\t");
        }
    }
}

public class Pattern2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}

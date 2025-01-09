import java.util.*;

class Pattern
{
    public static void Display(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            System.out.print(i+"\t");
            System.out.print("*\t");
            System.out.print(i+"\t");
        }
    } 
}

public class Pattern10 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue);
    }
}

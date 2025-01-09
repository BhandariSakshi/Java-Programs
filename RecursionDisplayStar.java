import java.util.*;

public class RecursionDisplayStar {

    static void Display(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("*");
            iNo--;
            Display(iNo);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Display(iValue);
    }
}

import java.util.*;

class Recursion
{
    public static void Display(int iNo, int i){


        if(i <= (iNo/2))
        {
            if (iNo % i == 0) {
                
                System.out.println(i);
            }
            Display(iNo, i+1);
        }
    }
}


public class RecursionFactorDisplay {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Recursion obj = new Recursion();

        obj.Display(iValue,1);
    }
}

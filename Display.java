import java.util.*;

class Display{

    public static void Pattern(int iNo)
    {
        int i = 0;

        for(i = 0; i < iNo; i++)
        {
            System.out.println("Jay Ganesh....");
        }
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Pattern(iValue);
    }
}
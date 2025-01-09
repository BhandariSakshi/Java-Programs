import java.util.*;

class Display2
{
    public static void Pattern(int iNo)
    {
        int i = 0;

        for(i = 1; i <= iNo; i++)
        {
            System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter th number: ");
        int iValue = sobj.nextInt();

        Pattern(iValue);
    }
}
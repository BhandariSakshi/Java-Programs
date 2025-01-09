import java.util.*;

class Display
{
    public void Factors(int iNo)
    {
        int i = 0;

        System.out.println("Factors are: ");
        for(i = 1; i <= iNo/2; i++)
        {
            if (iNo % i == 0) {
                
                System.out.println(i);
            }
        }
    }
}

class DisplayFactors
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Display obj = new Display();

        obj.Factors(iValue);
    }
}
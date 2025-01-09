import java.util.*;

class Pattern{

    public static void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        
    }
}

public class Pattern27
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the number of row: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the number of coulmn: ");
        iValue2 = sobj.nextInt();

        Pattern obj = new Pattern();

        obj.Display(iValue1, iValue2);
    }
}
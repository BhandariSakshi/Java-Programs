import java.util.*;

class Pattern{

    public static void Display()
    {
        int i = 0, j = 0;

        for(i = 1; i <= 3; i++)
        {
            for(j = 1; j <= 4; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
        
    }
}

public class Pattern25
{
    public static void main(String[] args) {
        
        Pattern obj = new Pattern();

        obj.Display();
    }
}
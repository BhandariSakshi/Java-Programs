import java.util.*;

class Pattern{

    public static void Display()
    {
        int i = 0;

        for(i = 1; i <= 4; i++)
        {
            System.out.print("*\t");
        }
        System.out.println();
        for(i = 1; i <= 4; i++)
        {
            System.out.print("*\t");
        }
        System.out.println();
        for(i = 1; i <= 4; i++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
}

public class Pattern24
{
    public static void main(String[] args) {
        
        Pattern obj = new Pattern();

        obj.Display();
    }
}
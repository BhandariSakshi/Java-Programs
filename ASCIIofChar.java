import java.util.*;

class Charecter
{
    public void Display(char ch)
    {
        System.out.println("Enter charecter is: "+ch);
        System.out.println("ASCII value of charecter is: "+(int)(ch));
    }
}

class ASCIIofChar
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the charecter: ");
        char ch = sobj.next().charAt(0);

        Charecter obj = new Charecter();

        obj.Display(ch);

    }
}
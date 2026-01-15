import java.util.*;

class StringRotation{

    public static boolean isRotation(String Str1, String Str2)
    {
        if(Str1.length() != Str2.length())
        {
            return false;
        }

        String temp = Str1+Str1;

        return temp.contains(Str2);
    }

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String Str1 = sobj.nextLine();

        System.out.println("Enter the second string: ");
        String Str2 = sobj.nextLine();

        if(isRotation(Str1, Str2))
        {
            System.out.println("String is Rotation");
        }
        else
        {
            System.out.println("String is not Rotation");
        }

    }
}
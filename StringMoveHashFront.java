import java.util.*;

class StringMoveHashFront{

    public static void moveHash(String str, int len)
    {
        String str1 = new String("");
        String str2 = new String("");

        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == '#')
            {
                str1 = str1 + str.charAt(i);
            }
            else{
                str2 = str2 + str.charAt(i);
            }
        }

        String result = str1.concat(str2);
        
        System.out.println("String after moving hashes front: "+result);
    }


    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string with hashes: ");
        String str = sobj.nextLine();
        int len = str.length();

        moveHash(str,len);
    }
}
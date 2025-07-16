import java.util.*;

class MobileNumberValidation{

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        long num = sobj.nextLong();


        if(num > 6000000000L && num < 10000000000L)
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}
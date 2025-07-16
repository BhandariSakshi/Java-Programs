import java.util.*;

class PANVALID{
    public static void main(String[]args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter: ");

        String pan = sobj.nextLine();

        if(pan.length() != 10)
        {
            System.out.println("Invalid");
        }
        else
        {
            boolean flag = true;
            for(int i = 0; i < pan.length(); i++)
            {
                char c = pan.charAt(i);
                if(i < 5)
                {
                    
                    if(c < 'A' || c > 'Z')
                    {
                        flag = false;
                    }
                }
                else if(i > 4 && i < 9)
                {
                    if(c < '0' || c > '9')
                    {
                        flag = false;
                    }
                }
                else {
                    char l = pan.charAt(9);
                    if(l < 'A' || l > 'Z')
                    {
                            flag = false;
                    }
                }
                
            }

    
            if(flag)
            {
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Not Valid");
            }
            }

        

    }
}
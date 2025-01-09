import java.util.*;

class TicketX
{
    public static int Amount(int iAge)
    {
        if (iAge <= 5) {
            return 0;
        }
        else if (iAge > 5 && iAge <= 18) {
            return 800;
        }
        else if (iAge > 18 && iAge < 60) {
            return 1000;
        }
        else
        {
            return 500;
        }
    }
}

class Ticket
{
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the your age: ");
        int iValue = sobj.nextInt();

        TicketX obj = new TicketX();

        int iRet = 0;

        iRet = obj.Amount(iValue);

        System.out.println("Total amount is: "+iRet);
        
    }
}
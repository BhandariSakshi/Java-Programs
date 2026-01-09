import java.util.*;

class HarshadNumber{

    public static void HarshadNum(int iNum)
    {
        int iSum = 0, oriNum = iNum;

        while(iNum > 0)
        {
            iSum += iNum % 10;
            iNum /= 10;
        }

        if(oriNum % iSum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not a Harshad Number");
        }
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int Num = sobj.nextInt();

        HarshadNum(Num);
    }
}
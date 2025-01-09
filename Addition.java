import java.util.*;

class Addition
{
    public static int Add(int iNo1, int iNo2)
    {
        int iAns = 0;

        iAns = iNo1 + iNo2;

        return iAns;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int iValue2 = sobj.nextInt();

        int iRet = 0;

       iRet = Add(iValue1, iValue2);

       System.out.println("Addition is: "+iRet);


    }
}
import java.util.*;

class Addition
{
    public int iAns;

    public int Add(int iNo1, int iNo2)
    {
        iAns = iNo1 + iNo2;

        return iAns;
    }

}

public class Addition2 {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter the second number: ");
        int iValue2 = sobj.nextInt();

        Addition obj = new Addition();

        int iRet = 0;

       iRet = obj.Add(iValue1, iValue2);

       System.out.println("Addition is: "+iRet);


    }
}

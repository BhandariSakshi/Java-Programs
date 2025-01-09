import java.util.*;

class Solution
{
    public static boolean CheckBit(int iNo)
    {
        int iMask = 0x00000008;
        int iResult = 0;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class CheckBit3
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Solution obj = new Solution();

        boolean bRet = obj.CheckBit(iValue);

        if (bRet == true) {
            
            System.out.println("4th bit is on");
        }
        else
        {
            System.out.println("4th bit is off");
        }
    }
}
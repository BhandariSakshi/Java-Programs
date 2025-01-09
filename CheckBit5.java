import java.util.*;

class Solution
{
    public static int Update(int iNo)
    {
        int iMask = 0xffff7fff;
        int iResult = 0;

        iResult = iNo & iMask;

        return iResult;
    }
}

public class CheckBit5
{
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Solution obj = new Solution();

        int iRet = obj.Update(iValue);

        System.out.println("Updated number is: "+iRet);
    }
}
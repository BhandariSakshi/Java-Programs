import java.util.*;

class Solution {
    public static int Sqrt(int iNum) {
        if (iNum == 0 || iNum == 1) {
            return iNum;
        }
        
        int left = 1, right = iNum, ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;  

            if (mid * mid == iNum) {
                return (int) mid;
            } else if (mid * mid < iNum) {
                ans = (int) mid;
                left = (int) mid + 1;  
            } else {
                right = (int) mid - 1;  
            }
        }
        return ans;  
    }
}

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iValue = sobj.nextInt();

        Solution obj = new Solution();
        int iRet = obj.Sqrt(iValue);
        System.out.println("Square root is: " + iRet);

        sobj.close();  
    }
}

import java.util.*;

class Solution
{
    public static double Power(double iNo, int Pow)
    {
        long binForm = Pow;
        double Ans = 1;

        if (Pow == 0) {
            
            return 1.0;
        }

        if (iNo == 0) {
            
            return 0.0;
        }
        if (iNo == 1) {
            
            return 1.0;
        }

        if (iNo == -1 && Pow%2 == 0) {
            
            return 1.0;
        }

        if (iNo == -1 && Pow%2 != 0) {
            
            return -1.0;
        }

        if (Pow < 0) {
            
            iNo = 1 / iNo;
            binForm = -binForm;
        }

        while (binForm > 0) {
            
            if (binForm % 2 == 1) {
                
                Ans *= iNo;
            }

            iNo *= iNo;
            binForm /= 2;
        }

        return Ans;
    }
}
public class PowerBinary {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double dValue = sobj.nextDouble();

        System.out.println("Enter the power: ");
        int iPower = sobj.nextInt();

        Solution obj = new Solution();

        double dRet = obj.Power(dValue, iPower);
        System.out.println("Answer is: "+dRet);
    }
}

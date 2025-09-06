import java.util.*;

public class CodeForce996A {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int Amount = sobj.nextInt();
        int iResult = 0;

        while(Amount > 0)
        {
            if(Amount >= 100)
            {
                Amount = Amount - 100;
                iResult++;
            }
            else if(Amount >= 20)
            {
                Amount = Amount - 20;
                iResult++;
            }
            else if(Amount >= 10)
            {
                Amount = Amount - 10;
                iResult++;
            }
            else if(Amount >= 5)
            {
                Amount = Amount - 5;
                iResult++;
            }
            else{
                Amount = Amount - 1;
                iResult++;
            }
        }

       System.out.println(iResult);
    }
}

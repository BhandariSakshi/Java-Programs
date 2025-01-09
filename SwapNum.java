import java.util.*;

class Num{

    void Swap(int []iValue)
    {
       int temp = iValue[0];

       iValue[0] = iValue[1];
       iValue[1] = temp;
    }
}

public class SwapNum {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the value of A: ");
        int A = sobj.nextInt();

        System.out.println("Enter the value of B: ");
        int B = sobj.nextInt();

        Num obj = new Num();

        int []iValues = {A, B};

        obj.Swap(iValues);

        A = iValues[0];
        B = iValues[1];

        System.out.println("Value of A after swapping: "+A);
        System.out.println("Value of B after swapping: "+B);
    }
}

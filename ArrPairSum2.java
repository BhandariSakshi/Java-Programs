import java.util.*;

class ArrayX {
    public int Arr[] = null;
    public int iSize = 0;

    ArrayX(int iNo) {
        iSize = iNo;
        Arr = new int[iNo];
    }

    void Accept() {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sobj.nextInt();
        }
    }

    int[] PairSum(int iTarget) {

        Arrays.sort(Arr);
        int Result[] = new int[2];

        int Start = 0, End = iSize - 1;

        while (Start < End) {
            int Pairsum = Arr[Start] + Arr[End];

            if (Pairsum > iTarget) {

                End--;

            } else if (Pairsum < iTarget) {
                Start++;
            } else {
                Result[0] = Start;
                Result[1] = End;

                return Result;
            }

        }

        return null;
    }
}

public class ArrPairSum2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);
        obj.Accept();

        System.out.println("Enter the target number: ");
        int Target = sobj.nextInt();

        int Result[] = obj.PairSum(Target);

        if (Result != null) {

            System.out.println("Element found at indices " + Result[0] + " " + Result[1]);
        }

        else {
            System.out.println("No pair found");
        }
    }
}

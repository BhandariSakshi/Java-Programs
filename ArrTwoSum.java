import java.util.Scanner;
import java.util.ArrayList;

class ArrayX {
    private int iSize = 0;
    private int[] Arr;

    public ArrayX(int iNo) {
        System.out.println("Inside the constructor");
        iSize = iNo;
        Arr = new int[iNo];
    }

    public void Accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < iSize; i++) {
            Arr[i] = sc.nextInt();
        }
    }

    public ArrayList<Integer> TwoSum(int Target) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < iSize - 1; i++) {
            for (int j = i + 1; j < iSize; j++) {
                if (Arr[i] + Arr[j] == Target) {
                    result.add(i);
                    result.add(j);
                    return result; 
                }
            }
        }

        return null; 
    }
}

public class ArrTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target sum: ");
        int iValue = sc.nextInt();

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sc.nextInt();

        ArrayX obj = new ArrayX(iCount);  

        obj.Accept();  

        ArrayList<Integer> iRet = obj.TwoSum(iValue);  

        if (iRet != null) {
            System.out.println("Indices: " + iRet.get(0) + " and " + iRet.get(1));
        } else {
            System.out.println("No two elements found with the given sum.");
        }

        sc.close();
    }
}


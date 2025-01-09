import java.util.*;

class Search {
    public int Arr[];

    public Search(int iNo) {
        Arr = new int[iNo];
    }

    void Accept() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the elements: ");
        for (i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

    }

    void search() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element that you want to search: ");
        int Value = sc.nextInt();

        boolean bFlag = false;

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == Value) {

                bFlag = true;
                break;
            }

        }
        if (bFlag == true) {

            System.out.println(Value + " is present");
        } else {
            System.out.println(Value + " is not present");
        }

    }

}

class LinearSearch {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;

        System.out.println("Enter the number of element that you want to store: ");
        iLength = sobj.nextInt();

        Search obj = new Search(iLength);

        obj.Accept();

        obj.search();

    }
}
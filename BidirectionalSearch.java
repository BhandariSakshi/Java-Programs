import java.util.Scanner;

class Search
{
    public int Arr[];

    public Search(int iNo)
    {
        Arr = new int[iNo];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void search()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number that you want to search: ");
        int iValue = sobj.nextInt();

        boolean bFlag = false;
        int iStart = 0, iEnd = 0;

        for(iStart = 0, iEnd = Arr.length - 1; iStart <= iEnd; iStart++, iEnd--)
        {
            if (Arr[iStart] == iValue || Arr[iEnd] == iValue) {
                
                bFlag = true;
                break;
            }
        }
        if (bFlag == true) {
            
            System.out.println(iValue + " is present");
        }
        else
        {
            System.out.println(iValue + " is not present");
        }
    }

}

public class BidirectionalSearch {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of element that you want to store: ");
        int iLength = sobj.nextInt();

        Search obj = new Search(iLength);

        obj.Accept();
        obj.search();
    }
}

import java.util.*;

class Search
{
    public int Arr[];

     Search(int iNo)
    {
        Arr = new int[iNo];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0;

        System.out.println("Enter the elements: ");
        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void search()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the element which you want search: ");
        int iValue = sobj.nextInt();

        boolean bFlag = false;

        int iStart = 0, iEnd = Arr.length-1, iMid = 0;

        while (iStart <= iEnd) 
        {
            iMid = iStart + (iEnd-iStart)/2;

            if (Arr[iStart] == iValue || Arr[iEnd] == iValue || Arr[iMid] == iValue) 
            {
                bFlag = true;
                break;
            }
            else if (iValue > iMid) {
                
                iEnd = iMid-1;
            }
            else if (iValue < iMid) {
                
                iStart = iMid+1;
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
public class BinarySearch {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iLength = 0;
        System.out.println("Enter the number of elements that you want to store: ");
        iLength = sobj.nextInt();

        Search obj = new Search(iLength);

        obj.Accept();
        obj.search();
    }
}

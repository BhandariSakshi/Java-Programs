//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.Return the largest lucky integer in the array. If there is no lucky integer return -1.

import java.util.*;

class ArrayX
{
    public int iSize = 0;
    public int []Arr = null;

    ArrayX(int iNo)
    {
        iSize = iNo;

        Arr = new int[iNo];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public int maxLucky()
    {
        int maxL = -1;

        for(int i = 0; i < iSize; i++)
        {
            int Count = 0;

            for(int j = 0; j < iSize; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    Count++;
                }
            }

            if(Count == Arr[i])
            {
                if (Arr[i] > maxL) {
                    maxL = Arr[i];
                } 
            }
        }

        return maxL;

    }

};


class ArrMaxLucky{

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();


        int iRet = obj.maxLucky();

        System.out.println("Max Lucky number is: "+iRet);
    }
}
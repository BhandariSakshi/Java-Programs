import java.util.*;

class ArrayX{

    private int iSize = 0;
    private int Arr[] = null;

    ArrayX(int iNum)
    {
        iSize = iNum;

        Arr = new int[iNum];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    void Display()
    {
        int newArr[] = new int[iSize];
        int newSize = 0;

        for(int i = 0; i < iSize; i++)
        {
            int iCnt = 0;
            for(int j = 0; j <= i; j++)
            {
                if(Arr[i] == Arr[j])
                {
                    iCnt++;
                }
            }

            if(iCnt == 1)
            {
                newArr[newSize] = Arr[i];
                newSize++;
            }
        }

        for(int i = 0; i < newSize; i++)
        {
            int iFreq = 0;
            for(int j = 0; j < iSize; j++)
            {
                if(newArr[i] == Arr[j])
                {
                    iFreq++;
                }
            }

            System.out.println(newArr[i]+ " occurs "+iFreq+" times");
        }
    }
}

class ArrCheckFrequency{

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int iCount = sobj.nextInt();

        ArrayX obj = new ArrayX(iCount);

        obj.Accept();
        obj.Display();
    }
}
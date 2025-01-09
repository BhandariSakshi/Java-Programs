import java.util.*;

class MatrixX
{
    public int Arr[][] = null;
    public int Rows = 0, Cols = 0;

    MatrixX(int Row, int Col)
    {
        Rows = Row;
        Cols = Col;

        Arr = new int[Row][Col];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements: ");
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
            System.out.println();
        }
    }

    int Minimum()
    {
        int iMin = Arr[0][0];
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                if (iMin > Arr[i][j]) {
                    
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
}


public class MatrixMinElement {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int Row = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(Row, iCol);

        obj.Accept();
        int iRet = obj.Minimum();

        System.out.println("Minimum element in the array is: "+iRet);
    }
}

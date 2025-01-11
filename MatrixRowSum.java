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

    void RowSum()
    {
        int iSum = 0;

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                iSum += Arr[i][j];
            }
            System.out.println("Sum of "+i+" is "+iSum);
            iSum = 0;
        }
    }
}

public class MatrixRowSum {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.RowSum();
    }
}

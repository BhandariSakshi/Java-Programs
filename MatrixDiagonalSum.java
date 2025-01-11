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

    void DiagonalSum()
    {
        int iSum = 0;

        if(Rows != Cols)
        {
            System.out.println("number of rows and columns shouls be same");
        }

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                if(i == j)
                {
                   iSum += Arr[i][j];
                }
            }
        }

        System.out.println("Diagonal sum is: "+iSum);
    }
}

public class MatrixDiagonalSum {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.DiagonalSum();
    }
}

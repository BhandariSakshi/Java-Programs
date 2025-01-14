import java.util.*;

class MatrixX
{
    public int Arr[][] = null;
    public int Rows = 0;
    public int Cols = 0;

    MatrixX(int Row, int Col)
    {
        Rows = Row;
        Cols = Col;

        Arr = new int[Row][Col];
    }

    void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the eements: ");
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
            System.out.println();
        }
    }

    void Display()
    {
        System.out.println("Matrix is: ");
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void SwapColumn()
    {
        int temp = 0;

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols-1; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[i][j+1];
                Arr[i][j+1] = temp;
            }
        }
    }
}

public class MatrixSwapColumn {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.SwapColumn();
        obj.Display();
    }
}

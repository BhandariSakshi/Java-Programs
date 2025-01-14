import java.util.*;

class MatrixX
{
    public int Arr[][] = null;
    int Rows = 0, Cols = 0;

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

    void OddToEven()
    {

        for(int i = 0; i < Rows; i++)
        {

            for(int j = 0; j < Cols; j++)
            {
                if (Arr[i][j] % 2 == 1) {
                    
                    Arr[i][j]++;
                }
            }
        }
       
    }
}

public class MatrixOddToEven {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.OddToEven();
        obj.Display();
    }
}

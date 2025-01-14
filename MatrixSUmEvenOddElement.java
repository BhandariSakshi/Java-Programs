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

    void SumEvenOdd()
    {
        int iSumE = 0, iSumO = 0;

        for(int i = 0; i < Rows; i++)
        {

            for(int j = 0; j < Cols; j++)
            {
                if (Arr[i][j] % 2 == 0) {
                    
                    iSumE += Arr[i][j];
                }
                else
                {
                    iSumO += Arr[i][j];
                }
            }
        }
        System.out.println("Sum of even elements: "+iSumE);
        System.out.println("Sum of odd element is: "+iSumO);
    }
}

public class MatrixSUmEvenOddElement {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.SumEvenOdd();
    }
}

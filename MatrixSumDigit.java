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

    void SumDigit()
    {
        int iDigit = 0, iNo = 0, iSum = 0;

        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                iNo = Arr[i][j];

                while (iNo != 0) {
                    
                    iDigit = iNo % 10;
                    iSum = iSum + iDigit;
                    iNo = iNo / 10;
                }
                System.out.print(iSum+"\t");
                iSum = 0;
            }
            System.out.println();
        }
    }
}

public class MatrixSumDigit {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(iRow, iCol);

        obj.Accept();
        obj.SumDigit();
    }
}

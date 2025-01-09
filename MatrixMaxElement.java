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

    int Maximum()
    {
        int iMax = Arr[0][0];
        for(int i = 0; i < Rows; i++)
        {
            for(int j = 0; j < Cols; j++)
            {
                if (iMax < Arr[i][j]) {
                    
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }
}


public class MatrixMaxElement {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int Row = sobj.nextInt();

        System.out.println("Enter the number of columns: ");
        int iCol = sobj.nextInt();

        MatrixX obj = new MatrixX(Row, iCol);

        obj.Accept();
        int iRet = obj.Maximum();

        System.out.println("Maximum element in the array is: "+iRet);
    }
}

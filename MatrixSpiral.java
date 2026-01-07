import java.util.*;

public class MatrixSpiral {

    public static List<Integer> solve(int[][] matrix, int row, int col) {

        List<Integer> res = new ArrayList<>();

        int top = 0, bottom = row - 1;
        int left = 0, right = col - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++)
                res.add(matrix[top][i]);
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println(solve(matrix, m, n));
    }
}

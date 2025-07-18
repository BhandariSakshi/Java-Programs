import java.util.Arrays;

public class PushZeroBack {
    public static void main(String[] args) {
        
         int Arr[] = {1, 0, 5, 0, 2, 3, 0, 0};
        int count = 0;

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] != 0) {
                Arr[count] = Arr[i];
                count++;
            }
        }

        while (count < Arr.length) {
            Arr[count] = 0;
            count++;
        }
        System.out.println(Arrays.toString(Arr));
    }
}

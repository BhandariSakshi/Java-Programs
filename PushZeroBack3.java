import java.util.Arrays;

public class PushZeroBack3 {
    public static void main(String[] args) {

        int Arr[] = {1, 0, 5, 0, 2, 3, 0, 0};

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == 0) {
                for (int j = i + 1; j < Arr.length; j++) {
                    if (Arr[j] != 0) {
                        
                        int temp = Arr[i];
                        Arr[i] = Arr[j];
                        Arr[j] = temp;
                        break; 
                    }
                }
            }
        }
        System.out.println(Arrays.toString(Arr));
    }
}

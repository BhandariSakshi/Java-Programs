import java.util.*;

class PythagorasTriplet{

    public static void FindTriplet(int Num)
    {
         for (int i = 1; i <= Num; i++) {
            for (int j = i + 1; j <= Num; j++) {
                
                int kSquare = (i * i) + (j * j);
                int k = (int) Math.sqrt(kSquare);

                if (k <= Num && k * k == kSquare) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNum = sobj.nextInt();

        FindTriplet(iNum);
    }
}
import java.util.*;

class ReverseVowel2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = sobj.nextLine();
        char[] Arr = name.toCharArray();

        int left = 0;
        int right = Arr.length - 1;

        while (left < right) {
            if (!isVowel(Arr[left])) {
                left++;
            } else if (!isVowel(Arr[right])) {
                right--;
            } else {
                char temp = Arr[left];
                Arr[left] = Arr[right];
                Arr[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arr);
    }

    static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

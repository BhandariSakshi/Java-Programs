import java.util.*;

public class StringToNumber {
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        long result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            if (sign * result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (sign * result <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sobj.nextLine();
        
        int result = myAtoi(str);
        System.out.println("Converted integer: " + result);
    }
}

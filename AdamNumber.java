//12=144 21=441
class AdamNumber {

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int num = 12;

        int sqOriginal = num * num;          
        int reverseNum = reverse(num);          
        int sqReverse = reverseNum * reverseNum; 
        int rSqOri= reverse(sqOriginal); 

        if (sqReverse == rSqOri) {
            System.out.println("Adam Number");
        } else {
            System.out.println("Not Adam Number");
        }
    }
}

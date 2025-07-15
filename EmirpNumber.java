class EmirpNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

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
        int num = 13;

        int rev = reverse(num);

        if (isPrime(num) && isPrime(rev) && num != rev) {
            System.out.println("Emirp Number");
        } else {
            System.out.println("Not Emirp Number");
        }
    }
}

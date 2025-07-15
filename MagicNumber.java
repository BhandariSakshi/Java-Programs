class MagicNumber {
    public static void main(String[] args) {
        int num = 19;
        int temp = num;

        while (temp > 9) {
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
        }

        if (temp == 1) {
            System.out.println("Magic Number");
        } else {
            System.out.println("Not Magic Number");
        }
    }
}

class DisariumNumber {

    public static void main(String[] args) {
        int num = 89;
        int temp = num;
        int len = String.valueOf(num).length(); 

        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp /= 10;
            len--;
        }

        if (sum == num) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not Disarium Number");
        }
    }
}

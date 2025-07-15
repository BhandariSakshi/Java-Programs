class DuckNumber {
    public static void main(String[] args) {
        int num =420;
        int temp = num;

        boolean hasZero = false;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0) {
                hasZero = true;
            }

            temp /= 10;
        }

        int firstDigit = num;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }

        if (hasZero && firstDigit != 0) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not Duck Number");
        }
    }
}

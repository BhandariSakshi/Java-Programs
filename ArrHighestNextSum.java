class ArrHighestNextSum {
    public static void main(String[] args) {
        int Arr[] = {4, 10, 7, 5, 8, 6};

        int sum = 0;

        for (int i = 0; i < Arr.length; i++) {
            boolean found = false;

            for (int j = i + 1; j < Arr.length; j++) {
                if (Arr[j] > Arr[i]) {
                    sum += Arr[j]; 
                    found = true;
                    break;
                }
            }

            if (!found) {
                sum += -1; 
            }
        }

        System.out.println(sum);
    }
}

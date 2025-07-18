class NivenNumber{
    public static void main(String[] args) {
        
        int num = 18;

        int sum = 0;
        int ori = num;
        while(num >0)
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        if(ori % sum == 0)
        {
            System.out.println("Niven Number");
        }
        else{
            System.out.println("Not Niven Number");
        }
    }
}
class StrongNumber{
    public static void main(String[] args) {
        
        int num = 145;

        int sum = 0;
        int ori = num;
        
        while(num >0)
        {
            int digit = num % 10;
            int pro = 1;
            for(int i = 1; i <= digit; i++)
            {
                pro *= i;
            }

            sum += pro;

            num /= 10;
        }

        if(sum == ori)
        {
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}
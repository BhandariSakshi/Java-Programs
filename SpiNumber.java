class SpiNumber{
    public static void main(String[] args) {
        
        int num = 1124;

        int sum = 0;
        int pro = 1;
        while(num > 0)
        {
        int mod = num%10;
        sum += mod;
        pro *= mod;
        num /= 10;
        }

        if(sum == pro)
        {
            System.out.println("Spi Number");
        }
        else{
            System.out.println("Not Spi Number");
        }
    }
}
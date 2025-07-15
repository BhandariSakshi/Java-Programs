
class Armstrong{
    public static void main(String[] args) {
        
        int num = 153;

        int sum = 0;
        int ori = num;
        while(num > 0)
        {
            int mod = num%10;
            sum += (mod*mod*mod);
            num = num/10;
        }

        if(ori == sum)
        {
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
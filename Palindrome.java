class Palindrome{
    public static void main(String[] args) {
        
        int num = 122;

        int reverse = 0;
        int ori = num;
        while(num > 0)
        {
            int mod = num%10;
            reverse = reverse*10+mod;
            num = num/10;
        }

        if(ori == reverse)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
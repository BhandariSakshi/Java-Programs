class AutomorphicNumber{
    public static void main(String[] args) {
        
        int num = 77;
        int pro = num*num;
    
        boolean flag = true;

        while(num > 0)
        {
           int mod1 = num%10;
           int mod2 = pro%10;
           if(mod1 != mod2)
           {
                flag = false;
                break;
           }

           num = num/10;
           pro = pro/10;
        }

        if(flag)
        {
            System.out.println("Automorphic");
        }
        else
        {
             System.out.println("Not Automorphic");
        }

    

      
    }
}
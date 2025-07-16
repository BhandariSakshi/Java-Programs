import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String str = sobj.nextLine();

        int len = 0;
        
        char Arr[] = str.toCharArray();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

       
        

            for(int i = 0; i < Arr.length; i++){
                
                if (Arr[i] >= 'A' && Arr[i] <= 'Z') {
                    hasUpper = true;
                } else if (Arr[i] >= 'a' && Arr[i] <= 'z') {
                    hasLower = true;
                } else if (Arr[i] >= '0' && Arr[i] <= '9') {
                    hasDigit = true;
                } else if (Arr[i] >= '!' && Arr[i] <= '~') {
                    hasSpecial = true;
                }
                len++;

            }
         if(len >= 8 && len <= 15){  

            if (hasUpper && hasLower && hasDigit && hasSpecial) {
                System.out.println("Strong Password");
            } else {
                System.out.println("Weak Password");
            }

        }

        else {
            System.out.println("Invalid Length.");
        }
    }
}

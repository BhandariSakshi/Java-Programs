
import java.util.Scanner;
import java.util.Stack;

public class StringBalancedParenthesis {
    
    public static boolean isBalanced(String S) {
        Stack<Character> stack = new Stack<>();

        for (char ch : S.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); 
            } else {
                if (stack.isEmpty()) return false; 

                char top = stack.pop();
                if (!((top == '(' && ch == ')') ||
                      (top == '{' && ch == '}') ||
                      (top == '[' && ch == ']'))) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the parentheses: ");
        String input = sc.next();

        if (isBalanced(input)) {
            System.out.println("Parentheses are balanced or valid");
        } else {
            System.out.println("Parentheses are not balanced or not valid");
        }

        sc.close();
    }
}



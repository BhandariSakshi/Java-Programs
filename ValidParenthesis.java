import java.util.Scanner;
import java.util.Stack;

class ValidParenthesis {
    
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        ValidParenthesis obj = new ValidParenthesis();
        boolean isValid = obj.isValid(input);

        if (isValid) {
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Not Valid Parenthesis");
        }

        sc.close();
    }
}

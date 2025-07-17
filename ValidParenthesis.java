import java.util.*;

public class ValidParenthesis {

    char arr[];
    int top;

    ValidParenthesis(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char a) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = a;
        }
    }

    char pop() {
        if (top == -1) {
            return '\0'; 
        } else {
            return arr[top--];
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    public static boolean isValid(String str) {
        ValidParenthesis stack = new ValidParenthesis(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                char topChar = stack.pop();

                if ((ch == ')' && topChar != '(') ||
                    (ch == '}' && topChar != '{') ||
                    (ch == ']' && topChar != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String input = sobj.nextLine();

        if (isValid(input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}

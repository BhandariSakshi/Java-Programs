import java.util.*;

public class ReverseNameStack {

    char arr[];
    int top;

    ReverseNameStack(int size) {
        arr = new char[size];
        top = -1;
    }

    void push(char a) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = a;
        }
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        } else {
            char popped = arr[top];
            top--;
            return popped;
        }
    }

    void peek() {
        if (top == -1) {
            System.err.println("Stack is Empty");
        } else {
            System.out.println("Peek element: " + arr[top]);
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sobj.nextLine();

        ReverseNameStack m = new ReverseNameStack(name.length());

        for (int i = 0; i < name.length(); i++) {
            m.push(name.charAt(i));
        }

        System.out.print("Reversed name: ");
        while (m.top != -1) {
            System.out.print(m.pop());
        }

        System.out.println();
    }
}

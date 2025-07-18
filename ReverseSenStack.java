import java.util.*;

public class ReverseSenStack {

    String arr[];
    int top;

    ReverseSenStack(int size) {
        arr = new String[size];
        top = -1;
    }

    void push(String a) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = a;
        }
    }

    String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return " ";
        } else {
            String popped = arr[top];
            top--;
            return popped;
        }
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sobj.nextLine();

         String[] words = sentence.split(" ");

        ReverseSenStack m = new ReverseSenStack(words.length);

        for (int i = 0; i < words.length; i++) {
            m.push(words[i]);
        }

        System.out.print("Reversed sentence: ");
        while (m.top != -1) {
            System.out.print(m.pop()+" ");
        }

        System.out.println();
    }
}

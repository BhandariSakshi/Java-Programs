import java.util.*;

class ArrHighestNextSumcopy {
    public static void main(String[] args) {
        int Arr[] = {4, 10, 7, 5, 8, 6};
        int sum = 0;
        int n = Arr.length;

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= Arr[i]) {
                stack.pop();
            }

            sum += stack.isEmpty() ? -1 : stack.peek();

            stack.push(Arr[i]);
        }

        System.out.println("Optimized Sum: " + sum);

    }
}

public class StackImplementation {
    
    int []arr;
    int top;

    StackImplementation(int size)
    {
        arr = new int[size];
        top = -1;
    }

    void push(int d)
    {
        if(top == arr.length)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            arr[top] = d;

        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Poped element is: "+arr[top]);
            top--;
        }
    }

    void peek()
    {
        if(top == -1)
        {
            System.err.println("Stack is Empty");
        }
        else
        {
            System.out.println("Peek element: "+arr[top]);
        }
    }

    void Display()
    {
        for(int i = 0; i <= top; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        StackImplementation m = new StackImplementation(5);

        m.push(10);
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);

        
        m.Display();
        m.peek();

        m.pop();
        m.Display();

    }
}

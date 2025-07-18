import java.util.*;

class StackLL{

    Node Head;

    class Node{
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    
    void Push(int d)
    {
        Node newNode = new Node(d);

        if(Head == null)
        {
            Head = newNode;
        }
        else{
            
            newNode.next = Head;
            Head = newNode;
            
        }
    }


    int Pop()
    {
        int iValue = 0;
         if(Head == null)
        {
            System.out.println("Stack is empty");
        }
        else{

            iValue = Head.data;
            Head = Head.next;
        }
        return iValue;
    
    }

 
    
    void Display()
    {
        if(Head == null)
        {
            System.out.println("Stack is empty");
        }
        else{
            Node temp = Head;

            while(temp != null)
            {
                System.out.print(+temp.data+" ");
                temp = temp.next;
            }

            System.out.println();

        }
    }
    


    public static void main(String[] args) {
        
        StackLL obj = new StackLL();

        obj.Push(11);
        obj.Push(21);
        obj.Push(51);
        obj.Push(101);

        obj.Display();

        int iRet = obj.Pop();
        System.out.println("Popped element: "+iRet);
        obj.Display();



    }
}
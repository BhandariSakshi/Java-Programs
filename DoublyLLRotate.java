public class DoublyLLRotate {
    
    Node Head;
    Node Tail;

    class Node{

        int data;
        Node next;
        Node prev;

        Node(int d)
        {
            this.data = d;
            this.next = null;
            this.prev = null;
        }

    }

    DoublyLLRotate()
    {
        this.Head = null;
        this.Tail = null;

    }

    void Insert(int d)
    {
        Node newNode = new Node(d);
        if(Head == null)
        {
            Head = newNode;
            Tail = newNode;
        }
        else{

         
           Tail.next = newNode;
           newNode.prev = Tail;
           Tail = newNode;

        }
    }

    void Delete(int val)
    {
        if(Head.data == val && Head.next==null)
        {
            Head = null;
            Tail = null;
        }
        else if(Head.data == val)
        {
            Head = Head.next;
            Head.prev = null;
        }
        else if(Tail.data == val)
        {
            Tail = Tail.prev;
            Tail.next = null;
        }
        else{
            Node temp = Head;

            while(temp.next != null && temp.next.data != val)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.prev = temp;
        }
    }

    void Display()
    {
        if(Head == null)
        {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = Head;
        System.out.print("null<->");

        while(temp!=null)
        {
            System.out.print("| "+temp.data+" |<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void LeftRotate(int k)
    {
        if(Head == null || Head.next == null)
        {
            return;
        }

        for(int i = 0; i < k; i++)
        {
            Node temp = Head.next;
            temp.prev = null;
            Tail.next = Head;
            Head.prev = Tail;
            Head.next = null;
            Tail = Head;
            Head = temp;
        }
        
    }

    void RightRotate(int k)
    {
       if(Head == null || Head.next == null)
       {
        return;
       }

       for(int i = 0; i < k; i++)
       {
        Node temp = Tail.prev;
        temp.next = null;
        Tail.next = Head;
        Head.prev = Tail;
        Head = Tail;
        Head.prev = null;
        Tail = temp;
       }
       
    }


    public static void main(String[] args) {
        
        DoublyLLRotate obj = new DoublyLLRotate();


        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(40);

        obj.Display();

        System.out.println("Left Rotate: ");
        obj.LeftRotate(2);
        obj.Display();

        System.out.println("Right Rotate: ");
        obj.RightRotate(1);
        obj.Display();

    }
}
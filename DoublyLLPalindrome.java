public class DoublyLLPalindrome {
    
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

    DoublyLLPalindrome()
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

    boolean Palindrome()
    {
        Node left = Head;
        Node right = Tail;

        while (left != null && right != null && left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }


    public static void main(String[] args) {
        
        DoublyLLPalindrome obj = new DoublyLLPalindrome();

        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(20);
        obj.Insert(10);

        obj.Display();


        if(obj.Palindrome())
        {
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("It is not Palindrome");
        }
    }
}

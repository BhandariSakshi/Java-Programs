import java.util.*;

class LinkList{

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

    void InsertLast(int d)
    {
        Node newNode = new Node(d);

        if(Head == null)
        {
            Head = newNode;
        }
        else{
            Node temp = Head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void InsertFirst(int d)
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

    void InserAtPos(int d, int Pos)
    {
        Node newn = new Node(d);
            
           Node temp = Head;

            for(int i = 1; i < Pos - 1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;

    }

    void Delete(int d)
    {
        Node temp = Head;
        if(Head == null)
        {
            System.out.println("LL is Empty");
        }
        else if(temp.next!=null && temp.next.data  != d)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
    }

    void Display()
    {
        if(Head == null)
        {
            System.out.println("LL is empty");
        }
        else{
            Node temp = Head;

            while(temp != null)
            {
                System.out.print("| "+temp.data+" |->");
                temp = temp.next;
            }

            System.out.println("null");
        }
    }
    


    public static void main(String[] args) {
        
        LinkList obj = new LinkList();

        obj.InsertLast(11);
        obj.InsertLast(21);
        obj.InsertLast(51);
        obj.InsertLast(101);

        obj.Display();

        obj.InsertFirst(10);
        obj.Display();

        obj.InserAtPos(23, 3);
        obj.Display();

        obj.Delete(21);
        obj.Display();



    }
}
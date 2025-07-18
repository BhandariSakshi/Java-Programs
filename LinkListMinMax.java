import java.util.*;

class LinkListMinMax{

    Node Head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void InsertLast(int d) {
        Node newNode = new Node(d);

        if (Head == null) {
            Head = newNode;
        } else {
            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void Display() {
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;

            System.out.println("LL is: ");
            while (temp != null) {
                
                System.out.print("| " + temp.data + " |->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    int Min()
    {
        int min = Head.data;
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;

            
            while (temp != null) {
                
                if(min > temp.data)
                {
                    min = temp.data;
                }
                temp = temp.next;
            }
            
        }
        return min;
    }

    int Max()
    {
        int max = Head.data;
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;

            
            while (temp != null) {
                
                if(max < temp.data)
                {
                    max = temp.data;
                }
                temp = temp.next;
            }
            
        }
        return max;
    }

    public static void main(String[] args) {
        LinkListMinMax obj = new LinkListMinMax();

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to add: ");
        int iCount = sobj.nextInt();

        System.out.println("Enter Elements: ");

        for(int i = 0; i < iCount; i++)
        {
            int val = sobj.nextInt();
            obj.InsertLast(val);
        }

        obj.Display();

        int iret1 = obj.Max();
        System.out.println("Maximum element: "+iret1);

         int iret2 = obj.Min();
        System.out.println("Minimum element: "+iret2);
        

        
    }
}
import java.util.*;

class LinkListPrime{

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

    void Prime(){
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;

            System.out.println("Prime LL is: ");
            while (temp != null) {
                
                boolean flag = true;
                for(int i = 2; i < temp.data; i++)
                {
                    if(temp.data % i == 0)
                    {
                        flag = false;
                    }
                }
                if(flag)
                {
                    System.out.print("| "+temp.data+" |->");
                }
                
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkListPrime obj = new LinkListPrime();

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

        obj.Prime();
        

        
    }
}
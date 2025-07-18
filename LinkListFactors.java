import java.util.*;

class LinkListFactors{

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

    void Factors()
    {
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;
            while (temp != null) {
                int fact = 1;
                
                for(int i = 1; i <= temp.data; i++)
                {
                    fact *= i;
                }
                System.out.print("| " + fact + " |->");
            
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkListFactors obj = new LinkListFactors();

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

        System.out.println("Factors Element LinkList: ");
        obj.Factors();

        
    }
}
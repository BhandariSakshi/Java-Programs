import java.util.*;

class QueueLL {

    Node Head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    void Enqueue(int d) {
        Node newNode = new Node(d);

        if (Head == null) {
            Head = newNode;
        } else {

            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;

        }
    }

    int Dequeue() {
        int iValue = 0;
        if (Head == null) {
            System.out.println("Queue is empty");
        }

        iValue = Head.data;
        Head = Head.next;

        return iValue;
    }

    void Display() {
        if (Head == null) {
            System.out.println("Queue is empty");
        } else {
            Node temp = Head;

            while (temp != null) {
                System.out.print(+temp.data + " ");
                temp = temp.next;
            }

            System.out.println();

        }
    }

    public static void main(String[] args) {

        QueueLL obj = new QueueLL();

        obj.Enqueue(11);
        obj.Enqueue(21);
        obj.Enqueue(51);
        obj.Enqueue(101);

        obj.Display();

        int iRet = obj.Dequeue();
        System.out.println("Removed element: " + iRet);
        obj.Display();

    }
}
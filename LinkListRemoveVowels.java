import java.util.*;

class LinkListRemoveVowels {

    Node Head;

    class Node {
        char data;
        Node next;

        Node(char d) {
            this.data = d;
            this.next = null;
        }
    }

    void InsertLast(char d) {
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

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    void Delete() {
        if (Head != null && isVowel(Head.data)) {
            Head = Head.next;
        }

        Node temp = Head;
        while (temp != null && temp.next != null) {
            if (isVowel(temp.next.data)) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }

    void Display() {
        if (Head == null) {
            System.out.println("LL is empty");
        } else {
            Node temp = Head;
            while (temp != null) {
                System.out.print("| " + temp.data + " |->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkListRemoveVowels obj = new LinkListRemoveVowels();

        obj.InsertLast('s');
        obj.InsertLast('a');
        obj.InsertLast('k');
        obj.InsertLast('s');
        obj.InsertLast('h');
        obj.InsertLast('i');

        System.out.println("Original Linked List:");
        obj.Display();

        obj.Delete();

        System.out.println("After Deleting Vowels:");
        obj.Display();
    }
}

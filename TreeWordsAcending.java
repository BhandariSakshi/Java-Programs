import java.util.*;
public class TreeWordsAcending {

    Node Root;
   
    class Node {
        String data;
        Node left;
        Node right;

        Node(String d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    TreeWordsAcending() {
        this.Root = null;
       
    }

    Node Insert(Node Root, String val) {
        Node newNode = new Node(val);
        if (Root == null) {
            Root = newNode;
        } 
        if(val.compareTo(Root.data) < 0)
        {
            Root.left = Insert(Root.left, val);
        }
        else if(val.compareTo(Root.data) > 0)
        {
            Root.right = Insert(Root.right, val);
        }
       
        return Root;

    }

    void Inorder(Node Root) {
        if (Root != null) {
            Inorder(Root.left);
            System.out.print(Root.data + " ");
            Inorder(Root.right);
        }

    }

    void Display(String sentence) {
        String[] words = sentence.split("\\s+");

        for (String word : words)
            Root = Insert(Root, word.toLowerCase());

        Inorder(Root);
    }


   
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeWordsAcending obj = new TreeWordsAcending();

        System.out.println("Enter the string: ");
        String str = sobj.nextLine();
        
        obj.Display(str);

    }
}

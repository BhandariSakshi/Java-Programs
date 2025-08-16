import java.util.*;

public class TreeDeleteinRange {

    Node Root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    TreeDeleteinRange() {
        this.Root = null;
    }

    Node Insert(Node Root, int val) {
        Node newNode = new Node(val);
        if (Root == null) {
            Root = newNode;
        } else if (val < Root.data) {
            Root.left = Insert(Root.left, val);
        } else {
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

    void Preorder(Node Root) {
        if (Root != null) {
            System.out.print(Root.data + " ");
            Preorder(Root.left);
            Preorder(Root.right);
        }
    }

    void Postorder(Node Root)
    {
        if(Root != null)
        {
            Postorder(Root.left);
            Postorder(Root.right);
            System.out.print(Root.data+" ");
        }
    }

    Node delete(Node Root, int start, int end)
    {

        if (Root == null) return null;

        Root.left = delete(Root.left, start, end);
        Root.right = delete(Root.right, start, end);

        if (Root.data >= start && Root.data <= end) {
            if (Root.left == null) return Root.right;
            if (Root.right == null) return Root.left;

            Root.data = min(Root.right);  
            Root.right = delete(Root.right, Root.data, Root.data); 
        }

        return Root;
        
    }

    int min(Node Root)
    {
        while (Root.left != null)
        Root = Root.left;
        return Root.data;
    }
    
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeDeleteinRange obj = new TreeDeleteinRange();

        obj.Root = obj.Insert(obj.Root, 11);
        obj.Root = obj.Insert(obj.Root, 9);
        obj.Root = obj.Insert(obj.Root, 3);
        obj.Root = obj.Insert(obj.Root, 21);
        obj.Root = obj.Insert(obj.Root, 51);
        obj.Root = obj.Insert(obj.Root, 101);
        obj.Root = obj.Insert(obj.Root, 111);

        System.out.println();

        System.out.println("Inorder Traversal: ");
        obj.Inorder(obj.Root);

        System.out.println();
        System.out.println("Preorder Traversal: ");
        obj.Preorder(obj.Root);

        System.out.println();
        System.out.println("Postorder Traversal: ");
        obj.Postorder(obj.Root);

        System.out.println();

        System.out.println("Give the starting element: ");
        int start = sobj.nextInt();

        System.out.println("Give the ending element: ");
        int end = sobj.nextInt();
        obj.delete(obj.Root, start, end);
        System.out.println("After deleting the element: ");
        obj.Inorder(obj.Root);
       
    }
}

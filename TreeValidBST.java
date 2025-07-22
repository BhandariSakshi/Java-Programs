import java.util.*;

public class TreeValidBST {

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

    TreeValidBST() {
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

    boolean isValid(Node Root)
    {
        return ValidBST(Root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean ValidBST(Node Root, long min, long max)
    {
        if (Root == null) return true;

        if (Root.data <= min || Root.data >= max)
            return false;

        return ValidBST(Root.left, min, Root.data) && ValidBST(Root.right, Root.data, max);
    }
        
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeValidBST obj = new TreeValidBST();

        obj.Root = obj.Insert(obj.Root, 6);
        obj.Root = obj.Insert(obj.Root, 4);
        obj.Root = obj.Insert(obj.Root, 8);
        obj.Root = obj.Insert(obj.Root, 3);
        obj.Root = obj.Insert(obj.Root, 5);
        obj.Root = obj.Insert(obj.Root, 7);
        obj.Root = obj.Insert(obj.Root, 9);

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

        boolean ret = obj.isValid(obj.Root);
        if(ret)
        {
            System.out.println("Valid BST");
        }
        else
        {
            System.out.println("Not Valid BST");
        }
    }
}

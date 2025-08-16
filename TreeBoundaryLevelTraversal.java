import java.util.*;

public class TreeBoundaryLevelTraversal {

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

    TreeBoundaryLevelTraversal() {
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

    void Postorder(Node Root) {
        if (Root != null) {
            Postorder(Root.left);
            Postorder(Root.right);
            System.out.print(Root.data + " ");
        }
    }

    void Boundary(Node Root)
    {

        System.out.print(Root.data+" ");
        Left(Root.left);
        Leaf(Root.left);
        Leaf(Root.right);
        Right(Root.right);
    }

    void Left(Node Root)
    {
        if(Root == null || (Root.left == null && Root.right == null))
        {
            return;
        }
        System.out.print(Root.data+" ");
        if(Root.left != null)
        {
            Left(Root.left);
        }
        else{
            Left(Root.right);
        }
    }
    void Right(Node Root)
    {
        if(Root == null || (Root.left == null && Root.right == null))
        {
            return;
        }
        System.out.print(Root.data+" ");
        if(Root.right != null)
        {
            Left(Root.right);
        }
        else{
            Left(Root.left);
        }
    }

    void Leaf(Node Root)
    {
        if(Root == null)
        {
            return;
        }

        Leaf(Root.left);
        if(Root.left == null && Root.right == null)
        {
            System.out.print(Root.data+" ");
        }
        Leaf(Root.right);
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeBoundaryLevelTraversal obj = new TreeBoundaryLevelTraversal();

        System.out.println("Enter the number of element you want to insert: ");
        int count = sobj.nextInt();

        for(int i = 0; i < count; i++)
        {
            int val = sobj.nextInt();
            obj.Root = obj.Insert(obj.Root, val);
        }

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

        System.out.println("Boundary Traversal: ");
        obj.Boundary(obj.Root);

    }
}

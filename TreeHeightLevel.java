import java.util.*;

public class TreeHeightLevel {

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

    TreeHeightLevel() {
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

    int Height(Node Root) {

        if(Root == null)
        {
            return 0;
        }
        int l = Height(Root.left);
        int r = Height(Root.right);

        if (l > r) {
            return l+1;
        } else {
            return r+1;
        }

    }

    int Level(Node Root, int ele) {
        if (Root == null) {
            return 0;
        }

        if (Root.data == ele) {
            return 1;
        }

        int leftLevel = Level(Root.left, ele);
        if (leftLevel > 0) {
            return leftLevel;
        }

        int rightLevel = Level(Root.right, ele);
        if (rightLevel > 0) {
            return rightLevel;
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeHeightLevel obj = new TreeHeightLevel();

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

        System.out.println("Height of Tree is: " + obj.Height(obj.Root));
        System.out.println("Level is: " + obj.Level(obj.Root, 8));
    }
}

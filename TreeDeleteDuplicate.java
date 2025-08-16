import java.util.*;

public class TreeDeleteDuplicate {

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

    TreeDeleteDuplicate() {
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

    Node removeDuplicates(Node root, HashSet<Integer> set){
        if (root == null) return null;

        root.left = removeDuplicates(root.left, set);
        root.right = removeDuplicates(root.right, set);

        if (set.contains(root.data)) {
            return delete(root, root.data);
        } else {
            set.add(root.data);
            return root;
        }
    }

    Node delete(Node Root, int ele)
    {
        if(Root == null)
        {
            return null;
        }
        else if(ele < Root.data)
        {
            Root.left = delete(Root.left, ele);
        }
        else if(ele > Root.data)
        {
            Root.right = delete(Root.right, ele);
        }
        else{
            if(Root.left == null)
            {
                return Root.right;
            }
            else if(Root.right == null)
            {
                return Root.left;
            }
            else{
                Root.data = min(Root.right);
                Root.right = delete(Root.right, Root.data);
            }
        }
        return Root;
    }

    int min(Node Root)
    {
        int minimum = Root.data;
        while(Root.left != null)
        {
            minimum = Root.left.data;
        }
        return minimum;
    }
    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        TreeDeleteDuplicate obj = new TreeDeleteDuplicate();

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

        obj.removeDuplicates(obj.Root, new HashSet<>());
        System.out.println("After Delete: ");
        obj.Inorder(obj.Root);
       
    }
}

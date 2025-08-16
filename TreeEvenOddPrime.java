public class TreeEvenOddPrime {

    Node Root;
    int sumE;
    int sumO;

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

    TreeEvenOddPrime() {
        this.Root = null;
        this.sumE = 0;
        this.sumO = 0;
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

    boolean Search(int val)
    {
        Node curr = Root;
        if (Root == null) {
            System.out.println("Tree is empty");
            
        }

        while(curr != null)
        {
            if(curr.data == val)
            {
                return true;
            }
            else if(val < curr.data)
            {
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }


        }
        return false;
       
    }

    void SumOdd(Node Root)
    {
        
        if(Root == null)
        {
            return;
        }
        SumOdd(Root.left);

        if(Root.data %2 == 0)
        {
            sumE += Root.data;
        }
        else{
            sumO += Root.data;
        }
        
        SumOdd(Root.right);

    
    }

    void DisplaySum()
    {
        SumOdd(Root);
        System.out.println("Sum of even elements: "+sumE);
        System.out.println("Sum of odd elements: "+sumO);

    }

    boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    void DisplayPrimes(Node Root) {
        if (Root == null)
            return;

        DisplayPrimes(Root.left);

        if (isPrime(Root.data)) {
            System.out.print(Root.data+" ");
        }

        DisplayPrimes(Root.right);
    }

    


    public static void main(String[] args) {

        TreeEvenOddPrime obj = new TreeEvenOddPrime();

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
        Boolean Ret = obj.Search(40);

        if(Ret)
        {
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }

        obj.DisplaySum();

        System.out.println("Prime Nodes are: ");
        obj.DisplayPrimes(obj.Root);

    }
}

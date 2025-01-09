import java.util.*;

class node
{
    int data;
    node lchild;
    node rchild;

    public node(int Value)
    {
        data = Value;
        lchild = null;
        rchild = null;
    }
}

class TreeImplementation
{
    public node Root;
    static int Leaf;
    static int Parent;
    static int all;

    TreeImplementation()
    {
        System.out.println("Inside Constructor");
        Root = null;
        Leaf = 0;
        Parent = 0;
        all = 0;
    }

   public void Insert(int No)
    {
    node newn = null;
    newn = new node(No);

    if (Root == null)
    {
        Root = newn;
    }
    else
    {
        node temp = Root;

        while (true)
        {
            if (temp.data == No)
            {
                System.out.println("Unable to insert node as element is already present");
        
                break;
            }
            else if (No > temp.data)
            {
                if (temp.rchild == null)
                {
                    temp.rchild = newn;
                    break;
                }
                temp = temp.rchild;
            }
            else
            {
                if (temp.lchild == null)
                {
                    temp.lchild = newn;
                    break;
                }
                temp = temp.lchild;
            }
        }
    }
    }

    public void Inorder()
    {
        InorderTraversal(Root);
    }

   public void InorderTraversal(node root)
    {
        if (root != null) {
            InorderTraversal(root.lchild);
            System.out.print(root.data+"\t");
            InorderTraversal(root.rchild);
        }
        
    }

public void Preorder()
    {
        PreorderTraversal(Root);
    }

   public void PreorderTraversal(node root)
    {
        if (root != null) {
            System.out.print(root.data+"\t");
            PreorderTraversal(root.lchild);
            PreorderTraversal(root.rchild);
        }
        
    }

    public void Postorder()
    {
        PostorderTraversal(Root);
    }

   public void PostorderTraversal(node root)
    {
        if (root != null) {
            
            PostorderTraversal(root.lchild);
            PostorderTraversal(root.rchild);
            System.out.print(root.data+"\t");
        }
        
    }
    

   public int CountLeaf()
    {
       return CountLeafI(Root);
    }

    public int CountLeafI(node root)
    {
        if (root != null)
        {
            if (root.rchild == null && root.lchild == null)
            {
                Leaf++;
            }
            CountLeafI(root.rchild);
            CountLeafI(root.lchild);
        }
        return Leaf;
    }
    public int CountParent()
    {
       return CountParentI(Root);
    }

    public int CountParentI(node root)
    {
        
        if (root != null)
        {
            if (root.rchild != null && root.lchild != null)
            {
                Parent++;
            }
            CountLeafI(root.rchild);
            CountLeafI(root.lchild);
        }
        return Parent;
    }
    public int CountALL()
    {
       return CountALLI(Root);
    }
    public int CountALLI(node root)
    {
        if (root != null) {
            all++;
            CountALLI(root.rchild);
            CountALLI(root.lchild);
        }
        return all;
    }

    public void Search(int Value)
    {
        boolean bFlag = false;

        if (Root == null) {
            System.out.println("Tree is empty");
        }
        while (Root != null) {

            if (Root.data == Value) {
                bFlag = true;
                break;
            }
            else if (Value > Root.data) {
                
                Root = Root.rchild;
            }
            else if (Value < Root.data) {
                
                Root = Root.lchild;
            }
            
        }

        if (bFlag == true) {
            
            System.out.println(Value+ " is present");
        }
        else
        {
            System.out.println(Value+ " is present");
        }
    }
}

class Tree
{
    public static void main(String[] args) {

        TreeImplementation obj = new TreeImplementation();

        obj.Insert(52);
        obj.Insert(32);
        obj.Insert(82);
        obj.Insert(12);
        obj.Insert(9);
        obj.Insert(22);
        obj.Insert(30);

        System.out.println("Inorder traversal: ");
        obj.Inorder();
        System.out.println("\nPreorder traversal: ");
        obj.Preorder();

        System.out.println("\nPostorder traversal: ");
        obj.Postorder();

        int iRet = 0;

        iRet = obj.CountLeaf();
        System.out.println("\nTotal leaf nodes are: "+iRet);

        iRet = obj.CountParent();
        System.out.println("\nTotal Parent nodes are: "+iRet);

        iRet = obj.CountALL();
        System.out.println("\nTotal nodes are: "+iRet);

        obj.Search(22);
        
    }
}
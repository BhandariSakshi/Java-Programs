import java.util.*;

class node
{
    public int data;
    public node next;
    public node prev;

    public node(int Value)
    {
        data = Value;
        next = null;
        prev = null;
    }
}

class Doubly
{
    public node First;
    public int iCount;

    Doubly()
    {
        System.out.println("Inside Constructor");
        First = null;
        iCount = 0;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Display
// Discription  : Used to display the Linked List
// Input        : PNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void Display()
    {
        node temp = First;

        System.out.print("null<=>");
        while (temp != null) {
            
            System.out.print("| "+temp.data+" |<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Count
// Discription  : Used to count the number of nodes in Linked List
// Input        : null
// Output       : Integer
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int Count()
    {
        return iCount;
    }

    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertFirst
// Discription  : Used to insert the node at first position in the Linked List
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void InsertFirst(int No)
    {
        node newn = null;
        newn = new node(No);

        if (First == null) {
            
            First = newn;
        }
        else
        {
            newn.next = First;
            First.prev = newn;
            First = newn;
        }
        iCount++;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertLast
// Discription  : Used to insert node at last position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void InsertLast(int No)
    {
        node newn = null;
        newn = new node(No);

        node temp = null;

        if (First == null) {
            
            First = newn;
        }
        else
        {
            temp = First;

            while (temp.next != null) {
                
                temp = temp.next;
            }
            temp.next = newn;
            newn.prev = temp;
        }
        iCount++;
    }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertAtPos
// Discription  : Used to node at given position in Linked List
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void InsertAtPos(int No, int iPos)
    {
        node newn = null;
        node temp = null;

        if ((iPos < 1) || (iPos > iCount+1)) {
            
            System.out.println("Invalid position");
            return;
        }
        if (iPos == 1) {
            
            InsertFirst(No);
        }
        else if (iPos == iCount+1) {
            
            InsertLast(No);
        }
       else
       {
        newn = new node(No);
         temp = First;

           int i = 0;

           for(i = 1; i < iPos-1; i++)
           {
                temp = temp.next;
           }

           newn.next = temp.next;
           temp.next = newn;

           iCount++;
       }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteFirst
// Discription  : Used to delete node at First position of Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void DeleteFirst()
    {
        if (First == null) {
            
            System.out.println("LinkList is empty");
            return;
        }
        else if (First.next == null) {

            First = null;
        }
        else
        {
            First = First.next;
            First.prev = null;
        }
        iCount--;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteLast
// Discription  : Used to delete node at last position of Linked List
// Input        : PPNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void DeleteLast()
    {
        if (First == null) {
            
            System.out.println("LinkList is empty");
            return;
        }
        else if (First.next == null) {
            
            First = null;
        }
        else
        {
            node temp = First;

            while (temp.next.next != null) {
                
                temp = temp.next;
            }
            temp.next = null;

            iCount--;
        }
    }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteAtPos
// Discription  : Used to delete node at given position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void DeleteAtpos(int iPos)
    {
        if ((iPos < 1) || (iPos > iCount)) {
            
            System.out.println("Invalid Position");
            return;
        }
        if (iPos == 1) {
            DeleteFirst();
        }
        else if (iPos == iCount) {
            
            DeleteLast();
        }
        else
        {
            node temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            iCount--;

        }
    }

}
class DoublyLinearLL{

    public static void main(String[] args)
    {
        Doubly obj = new Doubly();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        int iRet = 0;

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

        obj.InsertAtPos(30,3);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

        obj.DeleteFirst();

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

        obj.DeleteLast();

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

        obj.DeleteAtpos(3);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of node: "+iRet);

    }
}
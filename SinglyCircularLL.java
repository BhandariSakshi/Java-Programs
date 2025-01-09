import java.util.*;

class node
{
   public int data;
   public node next;

    public node(int Value)
    {
        data = Value;
        next = null;
    }
}

class SinglyCLL
{
    public node First;
    public node Last;
    public int iCount;

    SinglyCLL()
    {
        System.out.println("Object of LinkList gets created successfully");
        First = null;
        Last = null;
        iCount = 0;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Count
// Discription  : Used to count the number of nodes in Linked List
// Input        : null
// Output       : Integer
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Count()
    {
        return iCount;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Display
// Discription  : Used to display the Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {

        if ((First == null) && (Last == null)) {
            
            System.out.println("LinkList is empty");
            return;
        }
        do
        {
            System.out.print("| "+First.data+" |->");
            First = First.next;
        }while(First != Last.next);

        System.out.println();
 
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertFirst
// Discription  : Used to insert the node at first position in the Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertFirst(int No)
    {
        node newn = null;
        newn = new node(No);

        newn.data = No;
        newn.next = null;

        if ((First == null) && (Last == null)) {
            
            First = newn;
            Last = newn;
        }
        else
        {
            newn.next = First;
            First = newn;

        }
        Last.next = First;

        iCount++;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertLast
// Discription  : Used to insert node at last position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertLast(int No)
    {
        node newn = null;
        newn = new node(No);

        newn.data = No;
        newn.next = null;

        if ((First == null) && (Last == null)) {
            
            First = newn;
            Last = newn;
        }
        else
        {
           Last.next = newn;
           Last = newn;

        }
        Last.next = First;

        iCount++;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertAtPos
// Discription  : Used to node at given position in Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertAtPos(int No, int iPos)
    {
        node newn = null;
        node temp = null;

        if ((iPos < 1) || (iPos > iCount+1)) {
            
            System.out.println("Invalid Position");
            return;
        }
        if (iPos == 1) {
            
            InsertFirst(No);
        }
        else if(iPos == iCount+1)
        {
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
            newn.next = temp.next.next;
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
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteFirst()
    {
        if ((First == null) || (Last == null)) {
            
            System.out.println("LinkList is empty");
            return;
        }
        else if (First == Last) {
            
            First = null;
            Last = null;
        }
        else
        {
            First = First.next;
            Last.next = First;
        }
        iCount--;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteLast
// Discription  : Used to delete node at last position of Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 30/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteLast()
    {
        if ((First == null) || (Last == null)) {
            
            System.out.println("LinkList is empty");
            return;
        }
        else if (First == Last) {
            
            First = null;
            Last = null;
        }
        else
        {
            node temp = First;

            while (temp.next != Last) {
                
                temp = temp.next;
            }
            Last = temp;
            Last.next = First;
        }
        iCount--;
    }
    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteAtPos
// Discription  : Used to delete node at given position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 31/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteAtPos(int iPos)
    {
        node temp = null;

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
            temp = First;
            int i = 0;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            iCount--;

        }
    }
}

public class SinglyCircularLL {
    
    public static void main(String []args)
    {
        SinglyCLL obj = new SinglyCLL();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);

        obj.InsertAtPos(30, 3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);

        obj.DeleteLast();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);

        obj.DeleteAtPos(3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes: "+iRet);
    }
}

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

class DoublyCLL
{
    public node First;
    public node Last;
    public int iCount;

    DoublyCLL()
    {
        System.out.println("Object of LinkList created successfully");
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
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int Count()
    {
        return iCount;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Display
// Discription  : Used to display the Linked List
// Input        : PNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void Display()
    {
         if ((First == null) && (Last == null)) {
            System.out.println("LL is empty");
            return;
        }
        System.out.println("Elements of LL are: ");
        System.out.print("<=>");

        do {
            System.out.print("| " + First.data + " |<=>");
            First = First.next;
        } while (First != Last.next);

        System.out.println();
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertFirst
// Discription  : Used to insert the node at first position in the Linked List
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void InsertFirst(int No)
    {
        node newn = null;
        newn = new node(No);

        if ((First == null) && (Last == null)) {
            
            First = newn;
            Last = newn;
        }
        else
        {
            First.prev = newn;
            newn.next = First;
            
            First = newn;
          
            
        }
        Last.next = First;
        First.prev = Last; 

        iCount++;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertLast
// Discription  : Used to insert node at last position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void InsertLast(int No)
    {
        node newn = null;
        newn = new node(No);

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
        First.prev = Last; 

        iCount++;
    }
// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertAtPos
// Discription  : Used to node at given position in Linked List
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
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
        else if (iPos == iCount+1) {
            
            InsertLast(No);
        }
        else
        {
            newn = new node(No);

            temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.prev = temp;
            newn.next = temp.next;
            temp.next = newn;

            Last.next = First;
            First.prev = Last;

            iCount++;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteFirst
// Discription  : Used to delete node at First position of Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteFirst()
    {
        if ((First == null) && (Last == null)) {
            
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
            First.prev = Last;
        }
        iCount--;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteLast
// Discription  : Used to delete node at last position of Linked List
// Input        : PPNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteLast() 
    {
        if ((First == null) && (Last == null)) 
        {
            System.out.println("LinkList is empty");
            return;
        } 
        else if (First == Last)
        {
            First = null;
            Last = null;
        } 
        else 
        {
            Last = Last.prev;
            Last.next = First;
            First.prev = Last;
        }
        iCount--;
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Function Name: DeleteAtPos
    // Discription  : Used to delete node at given position of Linked List
    // Input        : Integer
    // Output       : Void
    // Author       : Sakshi Bhandari
    // Date         : 1/08/2024
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
        else if (iPos == iCount+1) {
            
            DeleteLast();
        }
        else
        {
        
            temp = First;

            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            Last.next = First;
            First.prev = Last;

            iCount--;
        }
    }
}

class DoublyCircularLL
{
    public static void main(String[] args) {

        DoublyCLL obj = new DoublyCLL();
        int iRet = 0;
        
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.InsertAtPos(31, 3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteAtPos(3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteLast();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        
        
    }
}
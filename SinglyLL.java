import java.util.*;

class node{
   public int data;
   public node next;

   public node(int Value)
   {
       data = Value;
       next = null;
   }
   
}

class singly
{
    public node First;
    public int iCount;

   

    singly()
    {
        System.out.println("Object of singly link list gets created successfully");
        First = null;
        iCount = 0;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Display
// Discription  : Used to display the Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {
       
        node temp = First;

         while (temp != null) 
         {
            System.out.print("| "+temp.data+" |->");
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
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Count()
    {
        return iCount;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertFirst
// Discription  : Used to insert the node at first position in the Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertFirst(int No)
    {
        node newn = null;
        newn = new node(No);

        if (First == null) 
        {
            First = newn;    
        }
        else
        {
            newn.next = First;
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
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertLast(int No)
    {
        node newn = null;
        newn = new node(No);
        node temp = null;

        if (First == null) 
        {
            First = newn;    
        }
        else
        {
            temp = First;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newn;
            temp = newn;
        }
        iCount++;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: InsertAtPos
// Discription  : Used to node at given position in Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void InsertAtPos(int No, int iPos)
    {
        int i = 0;
        
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
            
           node newn = new node(No);
            
           node temp = First;

            for(i = 1; i < iPos - 1; i++)
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
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteFirst()
    {
        if (First == null) {
            
            System.out.println("Linklist is empty");
            return;
        }
       else
        {
            First = First.next;
        }
        iCount--;

    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteLast
// Discription  : Used to delete node at last position of Linked List
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteLast()
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
        }
        iCount--;
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: DeleteAtPos
// Discription  : Used to delete node at given position of Linked List
// Input        : Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void DeleteAtPos(int iPos)
    {
        int i = 0;
        
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

            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            

            iCount--;
        }
    }

    
}

/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Main
// Discription  : Entry point function
// Input        : Null
// Output       : Integer
// Author       : Sakshi Bhandari
// Date         : 29/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class SinglyLL {

    public static void main(String[] args) {

        singly obj = new singly();
        int iRet = 0;

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(121);
        obj.InsertLast(151);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.InsertAtPos(60, 4);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteFirst();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteLast();

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);

        obj.DeleteAtPos(3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of nodes are: "+iRet);
    }
   
    
    
}
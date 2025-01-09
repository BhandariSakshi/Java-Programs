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

class stackImplement
{
    public node First;
    public int iCount;

    stackImplement()
    {
        System.out.println("Object of stack created successfully");
        First = null;
        iCount = 0;
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Count
// Discription  : Used to count the number of elements in Stack
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
// Discription  : Used to display the Stack
// Input        : PNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    void Display()
    {
        node temp = First;

        System.out.println("Elements in the stack are: ");

        while (temp != null) {
            
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Push
// Discription  : Used to insert the node in Stack
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    void Push(int No)
    {
        node newn = null;
        newn = new node(No);

        if (First == null) {
            
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        iCount++;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Pop
// Discription  : Used to delete node from the Stack
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    int Pop()
    {
        int iValue = 0;

        iValue = First.data;
        First = First.next;

        iCount--;
        
        return iValue;
        
    }
}


class Stack
{
    public static void main(String args[])
    {
        stackImplement obj = new stackImplement();
        int iRet = 0;

        obj.Push(11);
        obj.Push(21);
        obj.Push(51);
        obj.Push(101);
        obj.Push(111);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        iRet = obj.Pop();
        System.out.println("Poped element is: "+iRet);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);


    }
}
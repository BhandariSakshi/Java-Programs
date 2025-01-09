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

class QueueImplement
{
    public node First;
    public int iCount;

    QueueImplement()
    {
        System.out.println("Object of queue got successfully created");
        First = null;
        iCount = 0;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Count
// Discription  : Used to count the number of elements in Queue
// Output       : Integer
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Count()
    {
        return iCount;
    }
    /// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Display
// Discription  : Used to display the Queue
// Input        : PNODE
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {
        node temp = First;

        System.out.println("elements in the queue are: ");
        while (temp != null) {
            
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }
        System.out.println();
    }
/// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Enqueue
// Discription  : Used to insert the node in Queue
// Input        : PPNODE, Integer
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/08/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Enqueue(int No)
    {
        node newn = null;
        newn = new node(No);

        newn.data = No;
        newn.next = null;

        if (First == null) {
            
            First = newn;
        }
        else
        {
            node temp = First;

            while (temp.next != null) {
                
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Function Name: Dequeue
// Discription  : Used to delete node from the Queue
// Input        : null
// Output       : Void
// Author       : Sakshi Bhandari
// Date         : 1/07/2024
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int Dequeue()
    {
        int iValue = 0;

        if (First == null) {
            
            System.out.println("Queue is empty");
        }
        else if (First.next == null) {
            
            First = null;
        }
        else
        {
            iValue = First.data;
            First = First.next;
        }
        iCount--;

        return iValue;
    }
}


class Queue
{
    public static void main(String[] args) {
        
        QueueImplement obj = new QueueImplement();
        int iRet = 0;

        obj.Enqueue(151);
        obj.Enqueue(121);
        obj.Enqueue(111);
        obj.Enqueue(51);
        obj.Enqueue(21);
        obj.Enqueue(11);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of element in queue: "+iRet);

       iRet = obj.Dequeue();
       System.out.println("Dequeued element is: "+iRet);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of element in queue: "+iRet);

    }
}
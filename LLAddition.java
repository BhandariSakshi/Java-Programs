import java.util.*;

class node{
    public int data;
    public node next;

    public node(int Value)
    {
        data = Value;
        next = null;
    }
};

class LL
{
    public node First;
    public int iCount;

    LL()
    {
        First = null;
        iCount = 0;
    }

    int Count()
    {
        return iCount;
    }

    void Display()
    {
        node temp = null;
        temp = First;

        while (temp != null) {
            
            System.out.print("| "+(temp.data)+" | -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void InsertFirst(int iNo)
    {
        node newn = null;
        newn = new node(iNo);

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

    void InsertLast(int iNo)
    {
        node newn = null;
        newn = new node(iNo);
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
            newn.next = null;
            temp = newn;
        }

        iCount++;
    }

    void InsertAtPos(int iNo, int iPos)
    {
        node newn = null;
        node temp = null;

        if ((iPos < 1) || (iPos > iCount+1)) {
            
            System.out.println("Invalid position");
        }

        if (iPos == 1) {
            
            InsertFirst(iNo);
        }
        else if (iPos == iCount+1) {
            
            InsertLast(iNo);
        }
        else
        {
            newn = new node(iNo);

            temp = First;
            for(int i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            
            iCount++;
        }
    }

    void DeleteFirst()
    {
        if (First == null) {
            
            System.out.println("LL is empty");
            return;
        }
        else
        {
            First = First.next;
        }
        iCount--;
    }

    void DeleteLast()
    {
        
        if (First == null) {
            
            System.out.println("LL is empty");
            return;
        }
        else if(First.next == null)
        {
            First = null;

        }
        else{

           node temp = First;

            while (temp.next.next != null) {
                
                temp = temp.next;
            }
            temp.next = null;
        }
        iCount--;

    }

    void DeleteAtPos(int iPos)
    {
        if ((iPos < 1) || (iPos > iCount)) {
            
            System.out.println("Invalid position");
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

    int Addition()
    {
        node temp = First;
        int iSum = 0;
        
        while (temp != null) {
            
            iSum = iSum + temp.data;
            temp = temp.next;
        }

        return iSum;
    }
}
public class LLAddition {
    
    public static void main(String[] args) {
        
        LL obj = new LL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();
        int iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.InsertAtPos(39,3);

        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteFirst();
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteLast();
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        obj.DeleteAtPos(2);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number of elements are: "+iRet);

        int Result = obj.Addition();
        System.out.println("Addition is: "+Result);

    }
}

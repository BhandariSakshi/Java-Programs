import java.util.*;

class QuadrantX
{
    public static void Check(int x, int y)
    {
        if ((x > 0) && (y > 0)) {
            
            System.out.println("1st Quadrant");
        }
        else if ((x < 0) && (y > 0)) {
            
            System.out.println("2nd Quadrant");
        }
        else if ((x < 0) && (y < 0)) {
            
            System.out.println("3rd Quadrant");
        }
        else if ((x > 0) && (y < 0)) {
            
            System.out.println("4th Quadrant");
        }
        else if ((x == 0) && (y == 0)) {
            
            System.out.println("Origin");
        }
        else if ((x == 0)) {
            
            System.out.println("Y axis");
        }
        else if ((y == 0)) {
            
            System.out.println("X axis");
        }
    }
}

public class Quadrant {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the x co-ordinate: ");
        int x = sobj.nextInt();

        System.out.println("Enter the y co-ordinate: ");
        int y = sobj.nextInt();

        QuadrantX obj = new QuadrantX();

        obj.Check(x, y);
    }
}

import java.util.*;

class FahToCelX
{
    public static void Convert(float Start, float End, float step)
    {
        float cel = 0.0f, i = 0.0f;
        
        for(i = Start; i <= End; i+= step)
        {
            cel = (5.0f/9.0f)*(i-32);

            if (cel >= 0) {
                
                System.out.println(i+"\t"+Math.floor(cel));
            }
            else
            {
                System.out.println(i+"\t"+Math.ceil(cel));
            }
        }

    }
}

public class FahToCel {
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the starting value of fahrenheit: ");
        float fStartF = sobj.nextFloat();

        System.out.println("Enter the ending value of fahrenheit: ");
        float fEndF = sobj.nextFloat();

        System.out.println("Enter the starting value of fahrenheit: ");
        float fStepsF = sobj.nextFloat();

        FahToCelX obj = new FahToCelX();

        obj.Convert(fStartF, fEndF, fStepsF);
    }    
}

import java.util.*;

class ReverseVowel{
    public static void main(String[]args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name: ");

        String name = sobj.nextLine();
        char Arr[] = name.toCharArray();

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u' || Arr[i] == 'I' || Arr[i] == 'O' || Arr[i] == 'U' || Arr[i] == 'A' || Arr[i] == 'E')
            {
                st.push(Arr[i]);
            }
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'e' || Arr[i] == 'i' || Arr[i] == 'o' || Arr[i] == 'u' || Arr[i] == 'A' || Arr[i] == 'E' || Arr[i] == 'I' || Arr[i] == 'O' || Arr[i] == 'U')
            {
                Arr[i] = st.pop();
            }
        }

        System.out.println(Arr);
    }
}
import java.util.*;

public class CodeForce228AA {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int S1 = sobj.nextInt();
        int S2 = sobj.nextInt();
        int S3 = sobj.nextInt();
        int S4 = sobj.nextInt();

        Set<Integer> st = new HashSet<>();

        st.add(S1);
        st.add(S2);
        st.add(S3);
        st.add(S4);

        int distinct = st.size();

        System.out.println(4-distinct);

    }
}

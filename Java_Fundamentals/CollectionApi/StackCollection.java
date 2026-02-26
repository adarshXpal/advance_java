package CollectionApi;

import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Adarsh");
        st.push("Neelam");
        st.push("Vijay");
        st.push("Utkarsh");
        System.out.println("Heeeehe " + st.get(2));
        System.out.println(st.getLast());
        System.out.println(st.peek());
        System.out.println("Stack: " + st);
        System.out.println();
        Iterator<String> it = st.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator at: " + it.next());
        }
        st.pop();

        System.out.println("peek substitute: "+st.elements());
        System.out.println(st);

        System.out.println(st.size());
    }
}

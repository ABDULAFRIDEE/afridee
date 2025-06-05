package adf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

class CustomArrayList {
    public CustomArrayList() {
        ArrayList<String> st = new ArrayList<>();
        st.add("sammu");
        st.add("samm");
        st.add("sam");
        st.add("ammu");
        System.out.println(st);
    }

    class CustomLinkedList extends CustomArrayList {
        public CustomLinkedList() {
            LinkedList<String> st = new LinkedList<>();
            st.add("sammu");
            st.add("samm");
            st.add("sam");
            st.add("ammu");
            System.out.println(st);
        }
    }

    class CustomHashSet extends CustomArrayList {
        public CustomHashSet() {
            HashSet<String> vw = new HashSet<>();
            vw.add("sammu");
            vw.add("samm");
            vw.add("sam");
            vw.add("ammu");
            System.out.println(vw);
        }
    }

    class CustomHashMap extends CustomArrayList {
        public CustomHashMap() {
            HashMap<String, Integer> bt = new HashMap<>();
            bt.put("ammu", 1);
            bt.put("mu", 2);
            bt.put("samu", 3);
            bt.put("mmu", 4);
            System.out.println(bt);
        }
    }
}

public class Allsum {
    public static void main(String[] args) {
        CustomArrayList al = new CustomArrayList();
        LinkedHashSet<String> l1 = new LinkedHashSet<>();
        HashSet<String> h1 = new HashSet<>();
        CustomArrayList.CustomHashMap h2 = al.new CustomHashMap();
    }
}
package edu.cuw.java.unit3.sllisttrial;

/**
 * Used for 3.5 and 3.6
 */

public class Exercise3_5_1 {

    public static void main(String[] args) {
        DLList<Integer> dll = new DLList<>();
        dll.add(0, 4);
        dll.add(1, 3);
        dll.add(2, 2);
        dll.add(3, 1);
        dll.add(4, 0);

        System.out.println("DLL Next Nodes: " + dll);

        System.out.println("DLL Previous Nodes: " + dll.previousToString());

    }
}

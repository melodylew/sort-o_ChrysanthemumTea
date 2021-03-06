// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent: 2.5 hrs

import java.util.ArrayList;

public class Driver {
    public static ArrayList populateRandom( int size, int lo, int hi ) {
        ArrayList<Integer> retAL = new ArrayList<Integer>();
        while( size > 0 ) {
            //offset + rand int on interval [lo,hi]
            retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
            size--;
        }
        return retAL;
    }

    public static ArrayList populateChoices(String choice, int size) {
        ArrayList list = new ArrayList<Integer>(size);
        if (choice.equals("ascending")) {
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
        }
        else if (choice.equals("descending")) {
            for (int i = size-1; i >= 0; i--) {
                list.add(i);
            }
        }
        else if (choice.equals("same")) {
            for (int i = 0; i < size; i++) {
                list.add(0);
            }
        }
        else if (choice.equals("alternating")) {
            int offset = 1;
            for (int i = 0; i < size; i++) {
                list.add(i+offset);
                offset *= -1;
            }
        } else if (choice.equals("random")) {
            return populateRandom(size, 0, 1000);
        }
        return list;
    }

    public static ArrayList copyAL(ArrayList<Integer> arr) {
        ArrayList copy = new ArrayList<Integer>(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            copy.add(arr.get(i));
        }
        return copy;
    }

    public static void main(String[] args) {
        String[] choices = {"ascending", "descending", "same", "alternating", "random"};
        // run trials of 10, 100, 1000, 10000
        for (int size = 10; size <= 10_000; size*=10) {
            System.out.println("performing sorts using an ArrayList of size " + size + "\n");
            for (String choice: choices) {
                // make three array lists with the same values in the same order for consistency
                System.out.println("performing sort on a " + choice + " ArrayList");
                ArrayList chrys = populateChoices(choice, size);
                ArrayList anthe = copyAL(chrys);
                ArrayList mum = copyAL(chrys);

                long[] bubbleData = Sorts.bubble(chrys);
                System.out.println("bubble sort took " + bubbleData[0] + " swaps, " + bubbleData[1] + " comparisons, and " + bubbleData[2] + " passes.");

                long[] selectionData = Sorts.selection(anthe);
                System.out.println("selection sort took " + selectionData[0] + " swaps, " + selectionData[1] + " comparisons, and " + selectionData[2] + " passes.");

                long[] insertionData = Sorts.insertion(mum);
                System.out.println("insertion sort took " + insertionData[0] + " swaps, " + insertionData[1] + " comparisons, and " + insertionData[2] + " passes.");

                System.out.println();

            }
            System.out.println("=======================================================");
        }
    }
}

// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent:  0.5 hrs

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
            for (int i = size-1; i >= 0; i--) {//descending
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

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
        int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
            //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
            //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> chrys = new ArrayList<Integer>();
        String[] choices = {"alternating", "descending", "same", "alternating", "random"};

        // run trials of 10, 100, 1000, 10000, 100000
        for (int size = 10; size <= 100_000; size*=10) {
            System.out.println("performing sorts using an ArrayList of size " + size + "\n");
            for (String choice: choices) {
                System.out.println("performing sort on a " + choice + " ArrayList");
                System.out.println("bubble sort took " + Sorts.bubble(populateChoices(choice, size)) + " swaps");
                System.out.println("selection sort took " + Sorts.selection(populateChoices(choice, size)) + " swaps");
                System.out.println("insertion sort took " + Sorts.insertion(populateChoices(choice, size)) + " swaps");
                System.out.println();
            }
            System.out.println("=======================================================");
        }
    }
}

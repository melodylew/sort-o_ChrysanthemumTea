// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent:  0.5 hrs

import java.util.ArrayList;

public class Driver{
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
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
    int size = 0;
    ArrayList chrys;
    ArrayList anthe = new ArrayList<Integer>();
    ArrayList mum = new ArrayList<Integer>();
    for (int i = 1; i <= 5; i++){
      size += 10;
      System.out.println("\n\nTrial " + i + " using an ArrayList of Size " + size +":");
      chrys = populate( size, 1, 1000 ); //array of size 10 with random integers from 1 to 1000
      for (int n = 0; n < chrys.size(); n++){
        anthe.add(chrys.get(n));
        mum.add(chrys.get(n));
      }
      System.out.println( "\nArrayList before sorting:\n" + chrys );
      System.out.println("\nNumber of Swaps for Bubble Sort: " + Sorts.bubble(chrys));
      System.out.println("\nNumber of Swaps for Selection Sort: " + Sorts.selection(anthe));
      System.out.println("\nNumber of Swaps for Insertion Sort: " + Sorts.insertion(mum));
      System.out.println( "\nArrayList after sorting:\n" + chrys );
    }
  }
}

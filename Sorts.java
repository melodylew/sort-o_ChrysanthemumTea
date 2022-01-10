// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent: 2.5 hrs

import java.util.ArrayList;

public class Sorts {
    public static long[] bubble( ArrayList<Comparable> data )
    {
        long swapCount = 0;
        long comparisonCount = 0;
        long passCount;

        for( passCount = 0; passCount < data.size(); passCount++ ) {
            //iterate thru first to next-to-last element, comparing to next
            for( int i = 0; i < data.size()-1; i++ ) {

                //if element at i > element at i+1, swap
                comparisonCount++;
                if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) {
                    data.set( i, data.set(i+1,data.get(i)) );
                    swapCount++;
                }
            }
        }


        long[] counts = {swapCount, comparisonCount, passCount};
        return counts;
    }

    public static long[] selection( ArrayList<Comparable> data )
    {
        long swapCount = 0;
        long comparisonCount = 0;
        long passCount = 0;

        int maxPos=0;

        for(int pass = data.size() - 1; pass > 0; pass--) {
            passCount++;

            maxPos=0;
            for(int i = 0; i < pass + 1; i++) {
                comparisonCount++;
                if (data.get(i).compareTo(data.get(maxPos))>0) {
                    maxPos = i;
                }
            }
            data.set(pass, data.set(maxPos, data.get(pass)));
            swapCount++;
        }

        long[] counts = {swapCount, comparisonCount, passCount};
        return counts;
    }

    public static long[] insertion( ArrayList<Comparable> data )
    {
        long swapCount = 0;
        long comparisonCount = 0;
        long passCount = 0;

        for(int part = 0; part < data.size(); part++) {
            passCount++;
            for(int i = part; i > 0; i--) {
                comparisonCount++;
                if (data.get(i).compareTo(data.get(i-1)) < 0) {
                    data.set(i,data.set(i-1, data.get(i)));
                    swapCount++;
                }
                else
                    break;
            }
        }
        long[] counts = {swapCount, comparisonCount, passCount};
        return counts;
    }
}

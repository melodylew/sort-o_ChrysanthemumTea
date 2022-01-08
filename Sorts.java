// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent: 2.5 hrs

import java.util.ArrayList;

public class Sorts {
    public static long bubble( ArrayList<Comparable> data )
    {
        long counter = 0;
        int changes = 1;
        int passNum = 0;
        while ( changes > 0 ) {
            changes = 0;
            for( int i = data.size() - 1; i > passNum; i-- ) {
                if ( data.get(i).compareTo( data.get(i - 1) ) < 0 ) {
                    changes++;
                    data.set( i, data.set( i - 1, data.get(i) ) );
                    counter++;
                }
            }
        }
        return counter;
    }

    public static long selection( ArrayList<Comparable> data )
    {
        long counter = 0;
        int maxPos=0;
        for(int pass = data.size() - 1; pass > 0; pass--) {
            maxPos=0;
            for(int i = 0; i < pass + 1; i++) {
                if (data.get(i).compareTo(data.get(maxPos))>0) {
                    maxPos = i;
                }
            }
            data.set(pass, data.set(maxPos, data.get(pass)));
            counter++;
        }
        return counter;
    }

    public static long insertion( ArrayList<Comparable> data )
    {
        long counter = 0;
        for(int part = 0; part < data.size(); part++) {
            for(int i = part; i > 0; i--) {
                if (data.get(i).compareTo(data.get(i-1)) < 0) {
                    data.set(i,data.set(i-1, data.get(i)));
                    counter ++;
                }
                else
                    break;
            }
        }
        return counter;
    }
}

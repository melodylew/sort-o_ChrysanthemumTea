// Chrysanthemum Tea: Melody Lew, Anthony Sun, Ryan Lau
// APCS pd6
// L04: sorts
// 2022-01-07f
// time spent:  0.5 hrs

public class Sorts {
    public static void bubble( ArrayList<Comparable> data )
    {
        // VERSION THAT TERMINATES BASED ON NUMBER OF CHANGES MADE EACH PASS
        int changes = 1;
        int passNum = 0;
        while ( changes > 0 ) {
            changes = 0;
            for( int i = data.size() - 1; i > passNum; i-- ) {
                if ( data.get(i).compareTo( data.get(i - 1) ) < 0 ) {
                    changes++;
                    data.set( i, data.set( i - 1, data.get(i) ) );  // COOL SWAPPING B)
                }
            }
        }
    }

    public static void selection( ArrayList<Comparable> data )
    {
        //note: this version places greatest value at "rightmost" end
        //maxPos will point to position of SELECTION (greatest value)
        int maxPos=0;
        for(int pass = data.size() - 1; pass > 0; pass--) {
            maxPos=0;
            for(int i = 0; i < pass + 1; i++) {
                if (data.get(i).compareTo(data.get(maxPos))>0) {
                    maxPos = i;
                }
            }
            data.set(pass, data.set(maxPos, data.get(pass)));
        }
    }

    public static void insertion( ArrayList<Comparable> data )
    {
        for(int part = 0; part < data.size(); part++) {
            //partition marks first item in unsorted region
            //traverse sorted region from right to left
            for(int i = part; i > 0; i--) {
                // "walk" the current item to where it belongs
                // by swapping adjacent items
                if (data.get(i).compareTo(data.get(i-1)) < 0) {
                    data.set(i,data.set(i-1, data.get(i)));
                }
                else
                    break;
            }
        }
    }
}

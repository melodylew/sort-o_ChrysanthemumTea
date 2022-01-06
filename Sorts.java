//heading

public class Sorts{

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

      for(int pass = data.size()-1; pass > 0; pass--) {
        // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
        maxPos=0;

        for(int i = 0; i < pass+1; i++) {
          // System.out.println(i+",,"+maxPos); //diag
          if (data.get(i).compareTo(data.get(maxPos))>0) {
            maxPos = i;
          }


          // System.out.println( "maxPos: " + maxPos );//diag
          // System.out.println( data +"\n");//diag
        }

        System.out.println(maxPos);
        data.set(pass, data.set(maxPos, data.get(pass)));

        // System.out.println( "after swap: " +  data );//diag
      }
    }//end selectionSort
    
    public static void insertion( ArrayList<Comparable> data )
      {
        for(int part = 0; part < data.size(); part++) {
          //partition marks first item in unsorted region

          System.out.println( "\npartition: " + part + "\tdataset:"); //diag
          System.out.println( data );

          //traverse sorted region from right to left
          for(int i = part; i > 0; i--) {

            // "walk" the current item to where it belongs
            // by swapping adjacent items
            if (data.get(i).compareTo(data.get(i-1)) < 0) {
              data.set(i,data.set(i-1, data.get(i)));

              System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag

            }
            else
              break;
          }
        }
      }//end insertion


  public static void main(String[] args) {

  }
}

/*This program reads the greenness values of all gardens, finds the largest and second-largest values, and prints the highest greenness among the other gardens for each garden efficiently in O(n) time.*/
package track;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class App {
  public static void main(String[] args) throws IOException {
    // I/O reader that handle the large input..
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = null;

    //Getting N number of gardens.
    String line;
    while((line = br.readLine()) != null){
      line = line.trim();
      if(!line.isEmpty()){
        st= new StringTokenizer(line);
        break;
      }
    }

      //Retrun if input is not provide.
      if(st ==null || !st.hasMoreTokens()) return;

      //Total number of gardens
      int n = Integer.parseInt(st.nextToken());

      //Array that store the greenness value from each gardens using long type
      long[] a = new long[n]; 
      //Tracking the top maximum greeniness.
      long max1= Long.MIN_VALUE; // first hight value of greeness
      long max2 = Long.MIN_VALUE; // second hight value of greeness

      //Read the value of array elements.
      for (int i = 0; i<n ; i++){
        while(st== null || !st.hasMoreTokens()){
          line = br.readLine();
          if(line == null)break;
            st = new StringTokenizer(line);
          }
          
          if (st != null && st.hasMoreTokens()) {
              a[i] = Long.parseLong(st.nextToken());
                if (a[i] > max1) {
                    max2 = max1;
                    max1 = a[i];
                } else if (a[i] > max2 ) {
                    max2 = a[i];
                }
            }
        }
        //For output results
        //Using String Builder to determine the greeness of other side.
        StringBuilder sb = new StringBuilder();
            
        for(int j= 0; j<n; j++){
          if (a[j]== max1) {
                sb.append(max2).append("\n");
            }else{
              sb.append(max1).append("\n");
              }
    }
       //Out the result
        System.out.print(sb.toString());
  }
}
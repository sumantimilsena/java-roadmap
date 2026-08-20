import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Human {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                st = new StringTokenizer(line);
                break;
            }
        }

        if (st == null || !st.hasMoreTokens()) return;

        int n = Integer.parseInt(st.nextToken());
        long[] a = new long[n];
        
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        int max1Index = -1;

        // Read array elements and store index of max1
        for (int i = 0; i < n; i++) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            if (st != null && st.hasMoreTokens()) {
                a[i] = Long.parseLong(st.nextToken());
                if (a[i] > max1) {
                    max2 = max1;
                    max1 = a[i];
                    max1Index = i;
                } else if (a[i] > max2) {
                    max2 = a[i];
                }
            }
        }

        // Output results
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < j + n && j < n; j++) {
            // If the current element is the unique absolute maximum, print max2
            if (j == max1Index) {
                sb.append(max2).append("\n");
            } else {
                sb.append(max1).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
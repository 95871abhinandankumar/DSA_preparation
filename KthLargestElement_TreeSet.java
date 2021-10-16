import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;


public class KthLargestElement_TreeSet
{
    static class FastReader  {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
    
        long nextLong() { return Long.parseLong(next()); }
    
        double nextDouble() {
           return Double.parseDouble(next());
        }
        String nextLine(){
           String str = "";
           try {
               str = br.readLine();
           }
           catch (IOException e) {
               e.printStackTrace();
           }
           return str;
        }
    }
    
    
    public static void main(String[] args)
    {
        FastReader scan=new FastReader();
        int t = scan.nextInt();
        while(t-- > 0)
        {
            int n = scan.nextInt();
            TreeSet<Integer> ts = new TreeSet<>();

            for(int i = 0 ; i < n ; i++)
            {
                ts.add(scan.nextInt());
            }
            int k = scan.nextInt();
            
            int i = 1;
            while(i < k)
            {
                ts.pollFirst();
                i++;
            }
            System.out.println("Kth max element of given array is : " +  ts.pollFirst());
            
        }
    }
}
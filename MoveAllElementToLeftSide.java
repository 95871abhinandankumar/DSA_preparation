import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;


public class MoveAllElementToLeftSide
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
            int arr[] = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = scan.nextInt();
            }
            
            int i = 0, j = n-1;

            while(i < j)
            {
                while(i <= n-1 && arr[i] < 0)
                    i++;
                
                while(j >= 0 && arr[j] > 0)
                    j--;
                
                if(i < j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            for(int k = 0 ; k < n ; k++)
            System.out.print(arr[k] + " ");
        }
        System.out.println("\n");
    }
}

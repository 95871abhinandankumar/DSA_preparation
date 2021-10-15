import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;



public class quick_sort
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
    static int partition(int arr[], int lf, int rt)
    {
        int i = lf-1;
        

        for(int j = lf ; j <= rt-1 ; j++)
        {
            if(arr[rt] > arr[j])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[rt];
        arr[rt] = temp;



        return i+1;
    }

    static void quickSort(int[] arr, int lf, int rt)
    {
        if(lf < rt){

            int new_pi = partition(arr, lf, rt);
            quickSort(arr, lf, new_pi-1);
            quickSort(arr, new_pi+1, rt);
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

            quickSort(arr, 0, n-1);
            
            System.out.println("Array after sorting .....");
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
             
        }
    }
}
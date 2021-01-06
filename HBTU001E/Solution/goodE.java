import java.util.*;
import java.io.*;
import java.math.*;

class Practice 

{ 
	   static FastReader sc=new FastReader(); 
	   static PrintWriter out=new PrintWriter(System.out);
		  public static void main(String[] args) throws IOException
    {

			   int ttt =1;
			    	 ttt=i();

		        while (ttt-- > 0) 
				{

		        	int n=i();
		        	int m=i();
		        	long A[]=inputL(n);
		        	long B[]=inputL(m);
		        	long sum[]=new long[n];
		        	sum[0]=A[0];
		        	for(int i=1;i<n;i++) {
		        		sum[i]=A[i]+sum[i-1];
		        	}
		        	for(int i=0;i<m;i++) {
		        		int y=Arrays.binarySearch(sum, B[i]);
		        		int res=Math.abs(y+1);
		        		out.print(res+" ");
		        	}
		        	out.println();
		        }
			    	 out.close();
    }
		 

static int[] input(int n) {
	int A[]=new int[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextInt();
	   }
	   return A;
   }
static long[] inputL(int n) {
	long A[]=new long[n];
	   for(int i=0;i<n;i++) {
		   A[i]=sc.nextLong();
	   }
	   return A;
   }


     static int i() {
    	 return sc.nextInt();
     }
     static String s() {
    	 return sc.next();
     }
     static long l() {
    	 return sc.nextLong();
     }  
     
        
        
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
} 



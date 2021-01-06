import java.io.*;
import java.util.*;
import java.math.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;


public class Main
{
    static StringBuilder ans=new StringBuilder();
    static FastReader in=new FastReader();
    static ArrayList<ArrayList<Integer>> g;
    static long mod=1000000007;
    static boolean set[];

    public static void main(String args[])throws IOException
    {
       /*solutions begins here*/
      /*solutions begins here*/


    	int N=i();
   		int f[]=new int[1000001];
    	set=new boolean[1000001];
    	int A[]=new int[N];
    	for(int i=0; i<N; i++)
    	{
    		A[i]=i();
    	    f[A[i]]++;
    	}

    	sort(A);

    	int c=0;

        for(int i=0; i<N; i++)
    	{
    		if(!set[A[i]])
    		{

    			for(int s=A[i]; s<=1000000; s+=A[i])set[s]=true;
    	        if(f[A[i]]==1)
                 {
                  c++;
                  ans.append(A[i]+" ");
                 }
    		}
    	}
    	if(c==0)
        {
            System.out.println(-1);
            return;
        }

    	System.out.println(c+"\n"+ans);


        /*solution ends here */
       /*solution ends here*/
    }





    static boolean f(long fact,int A[],long s)
    	   {
    		   //long fact=factors.get(m);
    		   if(s%fact!=0)return false;
    		   //m is a factors of s
    		   long sum=0;

    		   for(int i=0; i<A.length; i++)
    		   {

    			   sum+=A[i];
    			   if(sum==fact)sum=0;
    			   //System.out.println(fact+" "+sum+" "+i);
    			   if(sum>fact)return false;
    		   }
//    		   /System.out.println("returning true for m"+m);
    		   return true;

    	   }





    static String f(String A)
    {
    	String X="";
        for(int i=A.length()-1; i>=0; i--)
        {
            int c=A.charAt(i)-'0';
            X+=(c+1)%2;
        }
        return X;
    }

    static void sort(long[] a) //check for long
    {
        ArrayList<Long> l=new ArrayList<>();
        for (long i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static String swap(String X,int i,int j)
    {
        char ch[]=X.toCharArray();
        char a=ch[i];
        ch[i]=ch[j];
        ch[j]=a;
        return new String(ch);
    }

    static int sD(long n)
    {

        if (n % 2 == 0 )
            return 2;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0 )
                return i;
        }

        return (int)n;
    }

    static void setGraph(int N)
    {
        set=new boolean[N+1];
        g=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=N; i++)
            g.add(new ArrayList<Integer>());
    }

    static void DFS(int N,int d)
    {
        set[N]=true;
        d++;
        for(int i=0; i<g.get(N).size(); i++)
        {
            int c=g.get(N).get(i);
            if(set[c]==false)
            {
                DFS(c,d);
            }
        }
    }

    static  long pow(long a,long b)
    {
        long mod=1000000007;
        long pow=1;
        long x=a;
        while(b!=0)
        {
            if((b&1)!=0)pow=(pow*x)%mod;
            x=(x*x)%mod;
            b/=2;
        }
        return pow;
    }

    static long toggleBits(long x)//one's complement || Toggle bits
    {
        int n=(int)(Math.floor(Math.log(x)/Math.log(2)))+1;

        return ((1<<n)-1)^x;
    }

    static int countBits(long a)
    {
        return (int)(Math.log(a)/Math.log(2)+1);
    }

    static long fact(long N)
    {
        long n=2;
        if(N<=1)return 1;
        else
        {
            for(int i=3; i<=N; i++)n=(n*i)%mod;
        }
        return n;
    }

    static int kadane(int A[])
    {
        int lsum=A[0],gsum=A[0];
        for(int i=1; i<A.length; i++)
        {
            lsum=Math.max(lsum+A[i],A[i]);
            gsum=Math.max(gsum,lsum);
        }
        return gsum;
    }

    static void sort(int[] a) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i:a) l.add(i);
        Collections.sort(l);
        for (int i=0; i<a.length; i++) a[i]=l.get(i);
    }

    static boolean isPrime(long N)
    {
        if (N<=1)  return false;
        if (N<=3)  return true;
        if (N%2 == 0 || N%3 == 0) return false;
        for (int i=5; i*i<=N; i=i+6)
            if (N%i == 0 || N%(i+2) == 0)
                return false;
        return true;
    }

    static int i()
    {
        return in.nextInt();
    }

    static long l()
    {
        return in.nextLong();
    }

    static int[] input(int N){
        int A[]=new int[N];
        for(int i=0; i<N; i++)
        {
            A[i]=in.nextInt();
        }
        return A;
    }

    static long[] inputLong(int N)     {
        long A[]=new long[N];
        for(int i=0; i<A.length; i++)A[i]=in.nextLong();
        return A;
    }

    static long GCD(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        else return GCD(b,a%b );
    }

}
//Code For FastReader
//Code For FastReader
//Code For FastReader
//Code For FastReader
class FastReader
{
    BufferedReader br;
    StringTokenizer st;
    public FastReader()
    {
        br=new BufferedReader(new InputStreamReader(System.in));
    }

    String next()
    {
        while(st==null || !st.hasMoreElements())
        {
            try
            {
                st=new StringTokenizer(br.readLine());
            }
            catch(IOException e)
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
        String str="";
        try
        {
            str=br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }

}
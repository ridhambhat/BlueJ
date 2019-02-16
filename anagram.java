import java.io.*;
import java.util.*;
class anagram
{
    static int top;
    
    public static void main(String args[])throws IOException
    {
        FileWriter fw=new FileWriter("anagram.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter");
        String str=sc.next();
        str=str.toUpperCase();
        int len=str.length();
        top=len;
        char ch[]=new char[len];
        String ana="";
        int c=0;
        for(int j=65;j<=90;j++)
        {
            for(int i=0;i<len;i++)
            {
                if((str.charAt(i))==(char)j)
                {
                    ch[c]=(char)j;
                    c++;
                }
            }
        }
        anagram obj=new anagram();
        obj.combination(ch,ana);
    }
    
    public static void combination(char arr[],String com)throws IOException
    {
        FileWriter fw=new FileWriter("anagram.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            
            String m=com+arr[i];
            if(arr.length>0)
            { 
                char arr2[]=new char[n-1];
                int c=0;
                for(int j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                        arr2[c]=arr[j];
                        c++;
                    }
                }
                combination(arr2,m);
            }
            
            if(m.length()==top)
            {
                pw.println(m);
                pw.flush();
            }
        }
    }
}

        
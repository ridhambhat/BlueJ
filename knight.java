import java.io.*;
import java.util.*;
class knight
{
    static int a[][]=new int [4][4];
    static String seq="";
    static int count=0;
    
    public static void main(String args[])throws IOException
    {
        knight obj=new knight();
        int i,j;
        FileWriter fw=new FileWriter("knight_ans.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                for(int t=0;t<4;t++)
                {
                    {
                        for(int m=0;m<4;m++)
                        {
                            a[t][m]=1;
                        }
                    }
                }
                a[3][0]=-1;
                a[3][3]=-1;
                seq="";
                if(a[i][j]!=-1)
                {
                    seq+=i+" "+j+" , ";
                    obj.test(i,j);
                }
            }
        } 
        
        FileWriter fw1=new FileWriter("knight_ans.txt",true);
        BufferedWriter bw1=new BufferedWriter(fw1);
        PrintWriter pw1=new PrintWriter(bw1);
        pw1.println("The total number of possible combinations are : "+count);
        pw1.flush();
    }
    
    public static void test(int i,int j)throws IOException
    {
        int x=i;
        int y=j;
        
        {
            j+=2; 
            i+=1;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j+=2;
            i-=1;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j+=1;
            i+=2;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j+=1;
            i-=2;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j-=2;
            i+=1;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j-=2;
            i-=1;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j-=1;
            i+=2;
            change(i,j);
        }
        
        i=x;j=y;
        {
            j-=1;
            i-=2;
            change(i,j);
        }
        
        check();
    }
    
    public static void change(int i, int j)throws IOException
    {
        if((j>=0)&&(j<=3)&&(i<=3)&&(i>=0))
        {
            if((a[i][j]!=-1))
            {
                seq+=i+" "+j+" , ";
                a[i][j]=-1;
                test(i,j);}
        }
    }
    
    public static void check()throws IOException
    {
        boolean y=true;
        int n=seq.length();
        for(int s=0;s<4;s++)
        {
            for(int u=0;u<4;u++)
            {
                if(a[s][u]!=-1)
                {
                    y=false;
                }
            }
        }
        if(y)
        {
            if(((seq.charAt(0))==(seq.charAt(n-6)))&&((seq.charAt(2))==(seq.charAt(n-4))))
            {
                FileWriter fw=new FileWriter("knight_ans.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(seq.substring(0,n-2));
                pw.flush();
                count++;
            }
        }
      
        if(n>=6)
        {String small=seq.substring(n-6);
        int l=(int)small.charAt(0)-48;
        int m=(int)small.charAt(2)-48;
        a[l][m]=1;
        seq=seq.substring(0,(n-6));}
    }
}

                
        
        
        

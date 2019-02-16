import java.io.*;
import java.util.*;
class knightv2
{
    static int a[][]=new int [4][4];
    static String seq="000  ";
    static int count=0;
    
    public static void main(String args[])throws IOException
    {
        knightv2 obj=new knightv2();
        int i,j;
        FileWriter fw=new FileWriter("knightv2_ans.txt");
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
                a[0][0]=-1;
                a[0][3]=-1;
                seq="000  ";
                if(a[i][j]!=-1)
                {
                    seq+=i+" "+j+" , ";
                    obj.testv2(i,j);
                }
            }
        } 
        
        FileWriter fw1=new FileWriter("knightv2_ans.txt",true);
        BufferedWriter bw1=new BufferedWriter(fw1);
        PrintWriter pw1=new PrintWriter(bw1);
        pw1.println("The total number of possible combinations are : "+count);
        pw1.flush();
    }
    
    public static void testv2(int i,int j)throws IOException
    {
        int x=i;
        int y=j;
        
        {
            j+=2; 
            i+=1;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j+=2;
            i-=1;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j+=1;
            i+=2;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j+=1;
            i-=2;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j-=2;
            i+=1;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j-=2;
            i-=1;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j-=1;
            i+=2;
            changev2(i,j);
        }
        
        i=x;j=y;
        {
            j-=1;
            i-=2;
            changev2(i,j);
        }
        
        checkv2();
    }
    
    public static void changev2(int i, int j)throws IOException
    {
        if((j>=0)&&(j<=3)&&(i<=3)&&(i>=0))
        {
            if((a[i][j]!=-1))
            {
                seq+=i+" "+j+" , ";
                a[i][j]=-1;
                testv2(i,j);}
        }
    }
    
    public static void checkv2()throws IOException
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
            if(((seq.charAt(5))==(seq.charAt(n-6)))&&((seq.charAt(7))==(seq.charAt(n-4))))
            {
                count++;
                String t=Integer.toString(count);
                int tc=t.length();
                String to="";
                for(int ss=1;ss<=(3-tc);ss++)
                {
                    to+="0";
                }
                to=to+t+"  ";
                seq=to+seq.substring(5);
                FileWriter fw=new FileWriter("knightv2_ans.txt",true);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(seq.substring(0,n-2));
                pw.flush(); 
                seq="000  "+seq.substring(5);
            }
        }
      
        if(n>=11)
        {String small=seq.substring(n-6);
        int l=(int)small.charAt(0)-48;
        int m=(int)small.charAt(2)-48;
        a[l][m]=1;
        seq=seq.substring(0,(n-6));}
    }
}

                
        
        
        

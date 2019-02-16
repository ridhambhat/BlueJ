import java.util.*;
class root
{
    public static void root(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number whose root is to be calculated");
        long a=sc.nextLong();
        System.out.println("Do you want decimals? \n Press 1 for YES \n Press 0 for NO");
        int ch=sc.nextInt();
        boolean st=false;
        if(ch==1)st=true;
        long r=a;
        int len=0;
        while(r!=0)
        {
            len++;
            r/=10;
        }
        boolean d=false;
        if(len%2!=0)
        {
            len++;
            d=true;
        }
        int no[]=new int[len];
        if(d)
        {
            no[0]=0;
        }
        r=a;
        int t=len-1;
        while(r!=0)
        {
            no[t]=(int)(r%10);
            r=r/10;
            t--;
        }
        int k=0;
        int rem=0;
        long q=0;
        long sqrt=0;
        long m=0;
        while(k<len)
        {
            long z=(rem*100)+(no[k]*10)+(no[k+1]);
            int i=0;
            for(i=0;i<=9;i++)
            {
                m=q;
                m=(m*10)+i;
                if((m*i)>z)
                break;
            }
            i-=1;
            q=q*10+i;
            rem=(int)(z-q*i);
            q+=i;
            k+=2;
            sqrt=sqrt*10+i;
        }
        System.out.print("Square root is "+ sqrt+".");
        int dp=0;
        sqrt=0;
        if(st)
        {
        while((rem!=0)&&(dp<3))
        {
            int z=(rem*100);
            int i=0;
            for(i=0;i<=9;i++)
            {
                m=q;
                m=(m*10)+i;
                if((m*i)>z)
                break;
            }
            i-=1;
            q=q*10+i;
            rem=(int)(z-q*i);
            q+=i;
            k+=2;
            sqrt=sqrt*10+i;
            dp++;
        }
        System.out.print(sqrt);
        }   
    }
}

                
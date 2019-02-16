import java.io.*;
class factorial_array
{
    public static void main(int n)
    {
        int arr[]=new int[10000];
        for(int t=0;t<10000;t++)
        {arr[t]=0;}
        arr[9999]=1;
        int a=0,b=0;
        for(int j=1;j<=n;j++)
        {
            b=0;
            for(int i=9999;i>=0;i--)
            {
                a=arr[i]*j;
                a+=b;
                arr[i]=a%10;
                b=a/10;
            }
        }
        int flag=0;
        for(int i=0;i<10000;i++)
        {
            if(arr[i]!=0)
            {
                flag=1;
            }
            if(flag==1)
            {
                System.out.print(arr[i]);
            }
        }
    }
}
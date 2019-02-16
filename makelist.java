import java.io.*;
class makelist
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        node arr=new node(n,null);
        
        node start,node2;
        start=arr;
        for(int i=1;i<=10;i++)
        {
            node2=new node((Integer.parseInt(br.readLine())),null);
            arr.next=node2;
            arr=arr.next;
        }
        
        for(int i=0;i<=10;i++)
        {
            System.out.println(start.value);
            start=start.next;
        }
        
    }
}
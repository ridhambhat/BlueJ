import java.io.*;
class fact_list
{
    public static node reverse(node s)
    {
        node prev=null;
        node nex;
        while(s!=null)
        {
            nex=s.next;
            s.next=prev;
            prev=s;
            s=nex;
        }
        return prev;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number whose factorial is to be calculated");
        int n=Integer.parseInt(br.readLine());
        node list=new node(1,null);
        int carry=0;
        node start,node1;
        start=list;
        for(int i=2;i<=n;i++)
        {
           list=start; 
           node1=start;
           carry=0;
           
           while(node1!=null)
            {
                int a=node1.value;
                a*=i;
                a+=carry;
                carry=a/10;
                a=a%10;
                list.value=a;
                if(list.next!=null)
                {
                    list=list.next;
                    node1=list;
                }
                else
                {
                    node1=list.next;
                }
                
            }
            while(carry!=0)
            {
                int pet=carry%10;
                carry=carry/10;
                node over=new node(pet,null);
                list.next=over;
                list=list.next;
            
            }
        }
        
        node n4=reverse(start);
        int r=0;
       

        while(n4!=null)
        {
            System.out.print(n4.value);
            n4=n4.next;
            r++;
        }
        System.out.println();
        System.out.println("The number of digits in factorial is :"+r);
    } 
}
            
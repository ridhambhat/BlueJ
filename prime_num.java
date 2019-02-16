import java.io.*;
class prime_num
{
    public boolean prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)count++;
        }
        if(count==2)return true;
        else return false;
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to be checked");
        int num=Integer.parseInt(br.readLine());
        prime_num obj=new prime_num();
        if(obj.prime(num))
        {
            System.out.println("The number is PRIME");
        }
        else
        {
            System.out.println("It is not PRIME");
        }

        for(int i=2;i>=0;i++)
        { 
            System.out.println("Do you want to check more numbers");
            System.out.println("Press 1 for yes and 0 for no");
            int check=Integer.parseInt(br.readLine());
            if(check==1)
            {
               System.out.println("Enter the number to be checked");
               num=Integer.parseInt(br.readLine());
               if(obj.prime(num))
               {
                   System.out.println("The number is PRIME");
                }
               else
               {
                   System.out.println("It is not PRIME");
                }
            }
            else if(check==0)
            {
                break;
            }
            else
            {
                System.out.println("Wrong Choice");
                continue;
            }
        }
    }
}
            


    
import java.io.*;
class fact
{
    public static void main(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
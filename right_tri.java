import java.io.*;
class right_tri
{
    public static void main(int n)throws IOException
    {
        FileWriter fw=new FileWriter("right_rectangle.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((n-i-1)<=j)
                pw.print("*");
                else
                pw.print(" ");
                pw.flush();
            }
            pw.println();
            pw.flush();
        }
    }
}

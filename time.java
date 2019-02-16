import java.io.*;
class time
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("write enter and start");
        String start=br.readLine();
        boolean i=true;
        int x=0;
        int j=0;
        int t=0;
        int k=0;
        int time[]=new int[4];
        time[0]=0;
        time[1]=0;
        time[2]=0;
        time[3]=0;
        System.out.print(""+time[0]+time[1]+":"+time[2]+time[3]+"  :  ");
        while(i)
        {
            if(x<=6711410)
            {
                x++;
                continue;
            }
                
            else if(t<=56400000)
            {
                x=0;
                t++;
            }
              
            else
            {
                if(j<10)
                {
                    System.out.print(j+"   ");
                    j++;
                    t=0;
                }
                else
                {
                    System.out.println();
                    time[3]++;
                    if(time[3]==10)
                    {
                        time[3]=0;
                        time[2]++;
                    }
                    if(time[2]==6)
                    {
                        time[2]=0;
                        time[1]++;
                    }
                    if(time[1]==10)
                    {
                        time[0]++;
                        time[1]=0;
                    }
                    System.out.print(""+time[0]+time[1]+":"+time[2]+time[3]+"  :  ");
                    j=0;
                    
                }
            }
        }
    }
}
            
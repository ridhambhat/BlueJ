import java.io.*;
class timer
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time for which timer has to be run in format 00:00 minute:second");
        String start=br.readLine();
        int sch[]=new int[4];
        sch[0]=(int)start.charAt(0)-48;
        sch[1]=(int)start.charAt(1)-48;
        sch[2]=(int)start.charAt(3)-48;
        sch[3]=(int)start.charAt(4)-48;
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
                
            else if(t<=57000000)
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
                    if((sch[0]==time[0])&&(sch[1]==time[1])&&(sch[2]==time[2])&&(sch[3]==time[3]))
                    {
                        i=false;
                        System.out.println("Timer Completed");
                    }
                    
                }
            }
        }
    }
}
            
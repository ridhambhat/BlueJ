import java.io.*;
class TimerV2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the time for which timer has to be run in format 00:00 minute:second");
        String start=br.readLine();
        int time[]=new int[4];
        time[0]=(int)start.charAt(0)-48;
        time[1]=(int)start.charAt(1)-48;
        time[2]=(int)start.charAt(3)-48;
        time[3]=(int)start.charAt(4)-48;
        boolean i=true;
        int x=0;
        int j=9;
        int t=0;
        int k=0;
        System.out.print(""+time[0]+time[1]+":"+time[2]+time[3]+"  :  ");
        while(i)
        {
            if(x<=4700000)
            {
                x++;
                continue;
            }
                
            else if(t<=54500000)
            {
                x=0;
                t++;
            }
              
            else
            {
                if(j>=0)
                {
                    System.out.print(j+"   ");
                    j--;
                    t=0;
                }
                else
                {
                    System.out.println();
                    time[3]--;
                    if(time[3]<0)
                    {
                        time[3]=9;
                        time[2]--;
                    }
                    if(time[2]<0)
                    {
                        time[2]=5;
                        time[1]--;
                    }
                    if(time[1]<0)
                    {
                        time[0]--;
                        time[1]=9;
                    }
                    System.out.print(""+time[0]+time[1]+":"+time[2]+time[3]+"  :  ");
                    j=9;
                    if((time[0]==0)&&(0==time[1])&&(0==time[2])&&(0==time[3]))
                    {
                        i=false;
                        System.out.println("Timer Completed");
                    }
                    
                }
            }
        }
    }
}
            
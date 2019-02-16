import java.io.*;
class factorial_string
{ 
    public static void main(String args[])throws IOException
    {
        int a=0,b=0;
        char ch=' ';
        String tem="";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number whose factorial is to be calcuated");
        String str=br.readLine();
        int len=str.length();
        int rrrr=1;
        String kaka="";
        for(int dd=len-1;dd>=0;dd--)
        {
            char ch8=str.charAt(dd);
            int ajaj=(int)ch8;
            ajaj=ajaj-48+rrrr;
            rrrr=ajaj/10;
            ajaj=ajaj%10;
            ajaj+=48;
            ch8=(char)ajaj;
            kaka=ch8+kaka;
        }
        while(rrrr!=0)
        {
            int rrr=rrrr%10;
            rrrr=rrrr/10;
            rrr+=48;
            char mun=(char)rrr;
            kaka=mun+kaka;
        }
        str=kaka;
        String temp="2";
        int m=0,r=0,s=0;
        String awe="1";
        String fact="";

        int count=0;
        int carry=0;
        int num=0;
        
        while((temp.compareTo(str))!=0)
        {
            String geo=temp;
            int glen=geo.length();
            num=0;
            for(int i=0;i<glen-1;i++)
            {
                char ch7=geo.charAt(i);
                int mmm=(int)ch7;
                mmm=mmm-48;
                num=num*10+mmm;
            }
            s=0;
            fact="";
            m=awe.length();
            for(int i=m-1;i>=0;i--)
            {
                  a=awe.charAt(i);
                  a-=48;
                  a*=num;
                  a+=s;
                  s=a/10;
                  a=a%10;
                  a+=48;
                  char ch4=(char)a;
                  fact=ch4+fact;
                }
            while(s!=0)
            {
                  int rem=s%10;
                  rem+=48;
                  s=s/10;
                  char ch4=(char)rem;
                  fact=ch4+fact;
            }
            awe=fact; 
             int rrrr2=1;
            String kaka2="";
            int lentemp=tem.length();
            for(int dd=lentemp-1;dd>=0;dd--)
           {
                char ch82=str.charAt(dd);
                int ajaj2=(int)ch82;
                ajaj2=ajaj2-48+rrrr2;
                rrrr2=ajaj2/10;
                ajaj2=ajaj2%10;
                ajaj2+=48;
                ch82=(char)ajaj2;
                kaka2=ch82+kaka2;
           }
           while(rrrr2!=0)
           {
              int rrr2=rrrr2%10;
              rrrr2=rrrr2/10;
              rrr2+=48;
              char mun2=(char)rrr2;
              kaka2=mun2+kaka2;
           }
        temp=kaka2;

        }
        System.out.println(awe);
    }      
}

                    
                    
                    
             
            
            
                 
                
       
                
                
                
            
            
        

        
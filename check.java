class check
{
    public static void main(int n)
    {
        int i=1;
        double p;
        while(n>(p=Math.pow(2,i)))
        {
            i++;
        }
        if(n==(p=Math.pow(2,i)))
        System.out.println("Comes");
        else
        System.out.println("Not Comes");
    }
}
        
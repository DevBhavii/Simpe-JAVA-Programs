class first_50_prime
{
    public static void main(String args[])
    {
        System.out.println("start...");
        int num = 5;
        int count = 0;
        int i = 2; 
        while(count<num)
        {
            int prime = 1;
          
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    prime = 0;
                    break;
                }
            }
            if(prime==1)
            {
                System.out.println(i+"\t");
                count++;
            }
            i++;
        }

    }
}
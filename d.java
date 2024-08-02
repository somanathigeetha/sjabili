class d
{
    public static void main(String args[])
    {
      int start=1,num=90,sum=0;
      while(start<=num)
      {
        if (num%start==0)
         {
         sum=sum+start;
         System.out.println(start);
         }
          start++;
       }
       System.out.println("sum is"+sum);
     }
}
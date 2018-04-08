import java.util.*;
class second_highest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int [10];
        System.out.println("enter 10 array element");
        for(int i=0;i<=9;i++)
        {
            ar[i]=sc.nextInt();
        }
        int max=ar[0],temp=ar[0];
        int j=0;
        for(int i =0;i<=9;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
                j=i;
            }
        }
        for(int i=0;i<=9;i++)
        {
            if(ar[i]>temp && j!=i)
            {
                temp=ar[i];
            }
        }
    
        System.out.println("second highest member is "+temp);
    }
}

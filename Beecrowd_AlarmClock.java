//https://www.beecrowd.com.br/judge/en/problems/view/1103?origem=1&msclkid=a1c99981d14511ec8b2a6ca99b72190b
import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int h1,m1,h2,m2;
        int a,b;
        while(sc.hasNext())
        {
            h1=sc.nextInt();
            m1=sc.nextInt();
            h2=sc.nextInt();
            m2=sc.nextInt();
            if(h1==0&&m1==0&&h2==0&&m2==0)
            {
                break;
            }
            if(h1==0)
            {
                a=24*60+m1;
            }
            else
            {
                a=h1*60 +m1;
            }
            if(h2==0) 
            {
                b=24*60 +m2;
            }
            else
            {
                b=h2*60+m2;
            }
            if(b>a)
            {
                System.out.println(b-a);
            }
            else
            {
                System.out.println(24*60-(a-b));
            }
        }
    }
}

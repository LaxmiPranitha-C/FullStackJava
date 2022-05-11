//https://www.beecrowd.com.br/judge/en/problems/view/1168?msclkid=7905f207d14511ec928ec56b6acb6f07
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    String str=sc.next();
		    int r,count=0;
		    char[] ch= str.toCharArray();
		    for(int j=0;j<str.length();j++)
		    {
		        
		        switch (ch[j]) {
                case '1':
                    count=count+2;
                    break;
                case '2':
                    count=count+5;
                    break;
                case '3':
                    count=count+5;
                    break;
                case '4':
                    count=count+4;
                    break;
                case '5':
                    count=count+5;
                    break;
                case '6':
                    count=count+6;
                    break;
                case '7':
                    count=count+3;
                    break;
                case '8':
                    count=count+7;
                    break;
                case '9':
                    count=count+6;
                    break;
                case '0':
                    count=count+6;
                    break;
                }
                
		    }
		    System.out.println(count+" leds");
		}
	}
}
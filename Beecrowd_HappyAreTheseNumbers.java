//https://www.beecrowd.com.br/judge/en/problems/view/3309?origem=1&msclkid=bb87c199d14511eca392ed86e52e6922
import java.io.IOException;
import java.io.*;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            int r;
            while(a[i]>0)
            {    
               r=a[i]%10;
               sum=sum+r*r;    
               a[i]=a[i]/10;  
            }
            while(sum!=1 && sum!=4)
            {
                a[i]=sum;
                sum=0;
                while(a[i]>0)
                {    
                   r=a[i]%10;
                   sum=sum+r*r;    
                   a[i]=a[i]/10;  
                }
            }
            if(sum==1)
            {
                count=count+1;
            }
            else
            {
                count=count+0;
            }
        }
        System.out.println(count);
    }
 
}
package jobsheet9;
import java.io.*;
import java.util.Scanner;
public class nilaiTerbesar {
    public static void main(String[] args)throws Exception
{
    BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
    int a,i;
    float rata,total=0;
    int maks=-1000; //asumsi paling minimum
    int min=1000; //asumsi paling maksimum
    System.out.print("Jumlah Angka : ");
    a = Integer.parseInt(kata.readLine());
    
    int[] Angka=new int[a];
    Scanner input = new Scanner(System.in);
    for(i=0;i<a;i++)
    {
        System.out.print("Nilai Terbesar " +(i+1)+" : ");
        Angka[i]=input.nextInt();
    }
    
    for (i=0;i<Angka.length;i++)
    {
        if(Angka[i]>maks)
        {
            maks=Angka[i];
        }
        total=total+Angka[i];
        System.out.println("");
    }
    
    rata=total/a;
    
    System.out.println("Nilai Terbesar "+ maks);
}
}
package jobsheet9;
import java.util.Scanner;
public class Kecepatan {
    public static void hitung(int a, int b){
        System.out.println("kecepatan"+ (a/b)+"km/jam");
    }
        public static void main(String[] args){
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("jarak :");
            int bilI = input.nextInt();
            
            System.out.print("waktu tempuh :");
            int bilII = input.nextInt();
            
            hitung (bilI, bilII);
    }
    
}

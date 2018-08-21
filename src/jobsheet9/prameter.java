package jobsheet9;

import java.util.Scanner;

public class prameter {
    public static void hitung(int a, int b){
        System.out.println("hasil: "+(a+b));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan I : ");
        int bil1 = input.nextInt();
        System.out.println("Masukkan bilangan II : ");
        int bil2 = input.nextInt();
        hitung (bil1,bil2);
        
        
    }
    
}

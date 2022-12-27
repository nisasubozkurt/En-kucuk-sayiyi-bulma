/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enküçüğübulma;

/**
 *
 * @author Su BOZKURT
 */
import java.util.Scanner;
public class Enküçüğübulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        Scanner giris = new Scanner(System.in);
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = giris.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = giris.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = giris.nextInt();
        
        int enkucuk = sayi1;
        
        if(sayi2 < enkucuk) {
            enkucuk = sayi2;
        }
        if(sayi3 < enkucuk) {
            enkucuk = sayi3;
        }
        
        System.out.println("Girilen sayılardan en enkucugu = " + enkucuk);
    }
    
}

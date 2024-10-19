/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
      
        
         System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        
        
         System.out.println("Türkçe notunuzu giriniz: ");
        turkce = scanner.nextInt();
        
         System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        
         System.out.println("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();
        
        ortalama = (mat +fizik +turkce +kimya +muzik)/5.0;
        
        System.out.println("Ortalamanız: " + ortalama);
        
        if(ortalama<55){
            System.out.println("Kaldınız !!");
        }
        else{
            System.out.println("Geçtiniz !!");
        }
    }
}

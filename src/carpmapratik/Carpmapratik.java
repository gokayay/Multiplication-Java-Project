/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpmapratik;

import java.util.Scanner;

/**
 *
 * @author Gokay
 */

// GÖKAY AY - 1306160093 - NYP 2. ÖDEV

public class Carpmapratik {

    static int i=0; 
    static int n1,n2,n3; 
    public static void main(String[] args) {
        
        System.out.println("Hosgeldiniz!");
        System.out.println("İkili ya da üclü carpma islemi yapmak icin 2 ya da 3 giriniz:");
        
        
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
        
        for(;i<=10;i++){
        
        switch(a){
            case 2:
              System.out.println("2'li Carpma Islemini sectiniz.");
              carpimIslemleri.carp(n1,n2);          // Classımızdan overloading mantığı ile çarp metodunu seçtik
              break;
                      
                      
            case 3:
              System.out.println("3'lü carpma islemini sectiniz.");
              carpimIslemleri.carp(n1,n2,n3);      // Classımızdan overloading mantığı ile çarp metodunu seçtik
              break;
              
            default:
                System.out.println("Hata! Lütfen 2 ya da 3 rakamını giriniz...");     
        }

        }
        carpimIslemleri cmh=new carpimIslemleri();   // Geçip geçmediğini hesapla metodu ile bulduk
        cmh.hesapla();
    }
    
}

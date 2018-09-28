/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpmapratik;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gokay
 */

//GÖKAY AY - 1306160093 - NYP 2. ÖDEV

public class carpimIslemleri{
      
    
   static int dogruSayisi=0; // doğru sayısını hesaplamak için   
  ///////////////////////////////////////////////////////////////////////////  
    public static void carp(int n1,int n2){
    
  
     
    Random rand =new Random();
    
    n1 = rand.nextInt(9) + 1;

    n2 = rand.nextInt(9)+1;
    
     int sonuc= n1*n2;
     
    
     
    System.out.println(n1+"*"+n2+"=?");
    
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
  
    
   if(sonuc==a )
   {
        String [] arr = {"Bravo !" ,"Aferin " ,"Doğru cevap " ,"Çok güzel !"};
         Random random = new Random();

         int select = random.nextInt(arr.length); 
         System.out.println(arr[select]);
         
         dogruSayisi++;
   }
    else  {
        String [] arr = {"Yanlış cevap !" ,"Dikkat! " ,"Biraz daha çalışmalısın " ,"Üzgünüm !"};
         Random random = new Random();

         int select = random.nextInt(arr.length); 
         System.out.println(arr[select]);
   }
   
  
  
    }
      ///////////////////////////////////////////////////////////////////////////  

      public static void carp(int n1,int n2,int n3){
        
        Random rand =new Random();
    
        n1 = rand.nextInt(9) + 1;

        n2 = rand.nextInt(9)+1;
    
        n3 = rand.nextInt(9)+1;
    
        int sonuc= n1*n2*n3;
     
    
     
    System.out.println(n1+"*"+n2+"*"+n3+"=?");
    
        Scanner scn= new Scanner(System.in);
        int a=scn.nextInt();
  
    
   if(sonuc==a )
   {
         String [] arr = {"Bravo !" ,"Aferin " ,"Doğru cevap " ,"Çok güzel !"};
         Random random = new Random();

         int select = random.nextInt(arr.length); 
         System.out.println(arr[select]);
         
         dogruSayisi++;
   }
  else  {
         String [] arr = {"Yanlış cevap !" ,"Dikkat! " ,"Biraz daha çalışmalısın " ,"Üzgünüm !"};
         Random random = new Random();

         int select = random.nextInt(arr.length); 
         System.out.println(arr[select]);
   }
   
  
  
    }
      
      ///////////////////////////////////////////////////////////////////////////  

   
       
     public void hesapla() {
      
       int onlukDogru= dogruSayisi*10;
   
   if(onlukDogru>=50 )
       {
       System.out.println("**********************************");
       System.out.println("Böyle çalışmaya devam et! Puanınız: "+ onlukDogru );
       }
   else
   {
        System.out.println("**********************************");
        System.out.println("Daha çok çalışmalısın! Puanınız: "+ onlukDogru );
   }
      }
      
}

package com.company;

import java.util.Scanner;

public class Main {

    private static Şarkıcılar şarkıcılar = new Şarkıcılar();
    private static Scanner scanner = new Scanner(System.in);

    public static void işlemleri_bastır(){

        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");

    }

    public static void şarkıcı_goruntule(){

        şarkıcılar.sarkicilari_bastir();
    }

    public static void şarkıcı_ekle(){

        System.out.println("Eklemek istediğiniz Şarkıcının ismi");
        String isim = scanner.nextLine();
        şarkıcılar.şarkıcı_ekle(isim);

    }

    public static void şarkıcı_güncelle(){

        System.out.println("Güncellemek istediğiniz pozisyon (1,2,3)");

        int pozisyon = scanner.nextInt();
        scanner.nextLine(); //dummy

        String yeni_isim = scanner.nextLine();
        şarkıcılar.şarkıcı_güncelle(yeni_isim, pozisyon-1);

    }

    public static void şarkıcı_sil(){

        System.out.println("Silmek istediginiz pozisyon (1,2,3...) ");

        int pozisyon = scanner.nextInt();

        şarkıcılar.şarkıcı_sil(pozisyon-1);
    }

    public static void şarkıcı_ara(){

        System.out.println("Aramak istediğiniz şarkıcı");
        String isim = scanner.nextLine();

        şarkıcılar.şarkıcı_ara(isim);
    }


    public static void main(String[] args) {

     işlemleri_bastır();

     boolean cikis = false;

     int islem;

     while(!cikis){

         System.out.println("Bir işlem seçiniz:");

         islem = scanner.nextInt();
         scanner.nextLine(); //dummy

         switch (islem){


             case 0:
                 işlemleri_bastır();
                 break;

             case 1:
                 şarkıcı_goruntule();
                 break;

             case 2:
                 şarkıcı_ekle();
                 break;

             case 3:
                 şarkıcı_güncelle();
                 break;

             case 4:
                 şarkıcı_sil();
                 break;

             case 5:
                 şarkıcı_ara();
                 break;

             case 6:
                 cikis = true;
                 System.out.println("Uygulamadan çıkılıyor");
                 break;
         }




     }


    }
}

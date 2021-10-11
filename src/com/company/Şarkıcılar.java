package com.company;

import java.util.ArrayList;

public class Şarkıcılar {

    private ArrayList<String> şarkıcı_listesi = new ArrayList<String>();

    public void sarkicilari_bastir(){

        System.out.println("Şarkıcı Listesinde " + şarkıcı_listesi.size() + " kadar şarkıcı var");

        for (int i = 0; i<şarkıcı_listesi.size(); i++){

            System.out.println((i+1) + ".Şarkıcı :" + şarkıcı_listesi.get(i));
        }
    }

     public void şarkıcı_ekle(String isim) {
         şarkıcı_listesi.add(isim);
         System.out.println("Şarkıcı Listesi güncellendi");
     }

     public void şarkıcı_güncelle(String yeni_isim, int pozisyon) {

        şarkıcı_listesi.set( pozisyon, yeni_isim);

         System.out.println("Şarkıcı Listesi Güncellendi...");
     }

      public void şarkıcı_sil(int pozisyon){

        String isim = şarkıcı_listesi.get(pozisyon);

        şarkıcı_listesi.remove(pozisyon);

        System.out.println(isim + "isimli şarkıcı listeden silindi");

      }

      public void şarkıcı_ara(String şarkıcı_ismi){

        int pozisyon = şarkıcı_listesi.indexOf(şarkıcı_ismi);

        if(pozisyon >= 0 ){
            System.out.println("Şarkıcı bulundu");
            System.out.println(şarkıcı_ismi + "isimli şarkıcı " + (pozisyon+1) + ". pozisyonda");
        }
        else{
            System.out.println("Şarkıcı bulunamadı");
        }
      }




}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kütüphaneumlmodelleme;

import kütüphaneumlmodelleme.KütüphaneUmlModelleme.Arama;

/**
 *
 * @author JET BİLİŞİM
 */
public class KütüphaneUmlModelleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public interface Arama{
    }
    
}
   class KütüphaneYönetimSistemi{
       public String KütüphaneAdı;
       public  String Adress;
        
        
    }
class Kitap{
public String ISBN;
public String KitapAdı;
public String KitapKonusu;
public String KitapYazarı;

}
class KitapÖğesi{

public String KitapKopyası;
public String Barcode;
}

class raf implements Arama{
    public String RafNo;
    public String Rafİsim;
    public String Açıklama; 
    }
class KitapRezervasyon implements Arama{
    public String KitapAdı;
    public String Barcode;
    public String KitapNo;
    
}
class Katalog implements Arama{
public String KitapBaşlık;
public String KitapYazar;
public String KitapYayınTarihi;
public String KitapKonu;

}

class Hesap{
    public String HesapNumarası;
    

}
class KütüphaneYönetici extends Hesap{
    public String ad;
    public String soyad;
     public String personelGörev;

    
    
}
class KütüphaneÜye extends Hesap{
public String ad;
    public String soyad;
     public int KayıtTarihi;
      public int ÜyeYaş;
    }
class KütüphaneKartı{
public String Barcode;
public String Numara;
public String ad;
public String soyad;


}
class BarkodOkuyucu{
public KütüphaneKartı Barcode;


}
class KitapGeriTeslim{

public int kitapAlınmaTarihi;
}
class ceza{
    public KitapGeriTeslim kitapAlınmaTarihi;
    public int kaçGünGecikti; 
    public int cezaBedeli;

}
class krediKartı extends ceza{


}
class Nakit extends ceza{

}

class bildirim {
public String KütüphaneGenelBildirimi;

void Mesajgönder(){

}
}
class mesajMobilGönderme extends bildirim{

public bildirim KütüphaneGenelBildirimiMobil;;
public int kullanıcıTelno;

}
class EpostaMesajGönderme extends bildirim{
    public String kullancıMailAdres;
    public bildirim KütüphaneGenelBildirimiMail;;
    

}

    
    
    


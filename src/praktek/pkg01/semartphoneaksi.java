/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.pkg01;

/**
 *
 * @author USER
 */
public class semartphoneaksi {
    public static void main(String[] args) {
        Semartphone oppo = new Semartphone();
        Semartphone apple = new Semartphone();
        Semartphone samsung = new Semartphone();
        
        oppo.merek="oppo";
        oppo.tipe="android";
        oppo.warna="hitam";
        oppo.memory="2GB";
        oppo.harga="1,500.000";
        
        apple.merek="apple";
        apple.tipe="ios";
        apple.warna="putih";
        apple.memory="8GB";
        apple.harga="7,500.000";
        
        samsung.merek="samsung";
        samsung.tipe="android";
        samsung.warna="hitam";
        samsung.memory="4GB";
        samsung.harga="5,500.000";
        
        oppo.cetakinfo();
        apple.cetakinfo();
        samsung.cetakinfo();
      
        
    }
}

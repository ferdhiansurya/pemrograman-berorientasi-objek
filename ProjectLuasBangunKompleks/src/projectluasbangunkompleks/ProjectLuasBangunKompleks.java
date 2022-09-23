/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ferdhian surya
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat obyek persegi
        Persegi A = new Persegi();
        
        // memberi nilai atribut sisi 
        A.sisi = 42;
        
        // menghitung luas persegi
        //A.hitungLuas();
        
        // membuat obyek lingkaran
        Lingkaran B = new Lingkaran();
        
        // memberi nilai atribut jejari 
        B.jejari = 21;
        
        // menghitung luas lingkaran
        //B.hitungLuas();
        
        // membuat obyek lingkaran
        SetengahLingkaran C = new SetengahLingkaran();
        Lingkaran2 D = new Lingkaran2();
 
        // memberi nilai atribut jejari 
        C.jejari = 14;
        D.jejari = 7;
        
        // menghitung luas gabungan
        double luasGabungan = A.hitungLuas() + B.hitungLuas() + B.hitungLuas();
        System.out.println("Luas gabungan project 1 adalah : " + luasGabungan);
        
        // menghitung luas gabungan
        double luasGabungan2 = C.hitungLuas() - D.hitungLuas();
        System.out.println("Luas gabungan project 2 adalah : " + luasGabungan2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author ferdhian surya
 */
public class Persegi {
    int s;
    double S;

    
    void hitungLuas(){
        int luas = this.s * this.s;
        System.out.println("Luas perseginya adalah : " + luas);
    }
    
    void hitungLuas2(){
        double luas = this.S * this.S;
        System.out.println("Luas persegi dengan type data double adalah : " + luas);
    }
    
    void hitungKeliling(){
        int keliling = this.s * 4;
        System.out.println("Keliling perseginya adalah : " + keliling);
    }
    
    void hitungKeliling2(){
        double keliling = this.S * 4;
        System.out.println("Keliling persegi dengan type data double adalah : " + keliling);
    }
}

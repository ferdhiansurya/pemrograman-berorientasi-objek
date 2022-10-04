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
public class PersegiPanjang {
    int p;
    double P;
    double L;
    int l;
    
    void hitungLuas(){
        int luas = this.p * this.l;
        System.out.println("Luas persegi panjangnya adalah : " + luas);
    }
    
    void hitungLuas2(){
        double luas = this.P * this.L;
        System.out.println("Luas persegi panjang dengan type data double adalah : " + luas);
    }
    
    void hitungLuas3(){
        double luas = this.p * this.L;
        System.out.println("Luas persegi panjang dengan type data double adalah : " + luas);
    }
    
    void hitungLuas4(){
        double luas = this.P * this.l;
        System.out.println("Luas persegi panjang dengan type data double adalah : " + luas);
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.p + this.l);
        System.out.println("Keliling persegi panjangnya adalah : " + keliling);
    }
    
    void hitungKeliling2(){
        double keliling = 2 * (this.P + this.L);
        System.out.println("Keliling persegi panjang dengan type data double adalah : " + keliling);
    }
    
    void hitungKeliling3(){
        double keliling = 2 * (this.P + this.l);
        System.out.println("Keliling persegi panjang dengan type data double adalah: " + keliling);
    }
    
    void hitungKeliling4(){
        double keliling = 2 * (this.p + this.L);
        System.out.println("Keliling persegi panjang dengan type data double adalah : " + keliling);
    }
}

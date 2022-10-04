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
public class Lingkaran {
    int r;
    double R;
    
    void hitungLuas(){
        double luas = 3.14 * this.r * this.r;
        System.out.println("Luas lingkarannya adalah : " + luas);
    }
    
    void hitungLuas2(){
        double luas = 3.14 * this.R * this.R;
        System.out.println("Luas lingkaran dengan type data double adalah : " + luas);
    }
    
    void hitungKeliling(){
        double keliling = 2 * 3.14 * this.r;
        System.out.println("Keliling lingkarannya adalah : " + keliling);
    }
    
    void hitungKeliling2(){
        double keliling = 2 * 3.14 * this.R;
        System.out.println("Keliling lingkaran dengan type data double adalah : " + keliling);
    }
    
}

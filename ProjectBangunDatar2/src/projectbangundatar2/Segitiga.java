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
public class Segitiga {
    int a;
    double A;
    double T;
    int t;
    
    void hitungLuas(){
        int luas = 1/2 * this.a * this.t;
        System.out.println("Luasnya adalah : " + luas);
    }
    
    void hitungLuas2(){
        double luas = 1/2 * this.A * this.T;
        System.out.println("Luasnya adalah : " + luas);
    }
    
    void hitungLuas3(){
        double luas = 1/2 * this.a * this.T;
        System.out.println("Luasnya adalah : " + luas);
    }
    
    void hitungLuas4(){
        double luas = 1/2 * this.A * this.t;
        System.out.println("Luasnya adalah : " + luas);
    }
    
}

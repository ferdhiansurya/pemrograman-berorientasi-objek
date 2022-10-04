/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author ferdhian surya
 */
public class Operasi {
    int jumlahkan(int a, int b){
        int hasil = a + b;
        System.out.println(hasil);
        return (int) hasil;
    }
    
    int jumlahkan(int a, int b, int c){
        int hasil = a + b - c;
        System.out.println(hasil);
        return (int) hasil;
    }
    
    int jumlahkan(int a, int b, double c){
        double hasil = a + b + c;
        System.out.println(hasil);
        return (int) hasil;
    }
    
    int jumlahkan(double a, double b, double c){
        double hasil = a - b + c;
        System.out.println(hasil);
        return (int) hasil;
    }
    
    int jumlahkan(int a, double b, double c){
        double hasil = a * b * c;
        System.out.println(hasil);
        return (int) hasil;
    }


}

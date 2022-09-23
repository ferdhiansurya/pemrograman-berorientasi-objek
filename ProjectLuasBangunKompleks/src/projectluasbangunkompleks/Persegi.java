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
public class Persegi {
    int sisi;
        int hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
        return (int) luas;
    }
}

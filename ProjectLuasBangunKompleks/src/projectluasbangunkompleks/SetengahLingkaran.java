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
public class SetengahLingkaran {
    int jejari;
    
    int hitungLuas() {
        double luas = 0.5 * 3.14 * jejari * jejari;
        System.out.println("Luas setengah lingkaran : " + luas);
        return (int) luas;
    }
}

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
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operasi o = new Operasi();
        
        o.jumlahkan (3, 4);
        o.jumlahkan (4, 7, 9);
        o.jumlahkan (3.4, 0.002, 0.12313);
        o.jumlahkan(3, 5, 7);
    }
    
}

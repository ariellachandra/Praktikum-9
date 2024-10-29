/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PenentuJumlahHari;

/**
 *
 * @author lenovo
 */
public class HitungHari {
    public int hitung(int tahun, int bulan) {
        int hari = 0;
        switch (bulan) {
            case 1: 
            case 3: 
            case 5: 
            case 7: 
            case 8: 
            case 10: 
            case 12:
                hari = 31;
                break;
            case 4: 
            case 6: 
            case 9: 
            case 11:
                hari = 30;
                break;
            case 2:
                
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                    hari = 29;
                    break;
                } else {
                    hari = 28;
                    break;
                }
               
            default:
                break;
        }
        return hari;
    }
}

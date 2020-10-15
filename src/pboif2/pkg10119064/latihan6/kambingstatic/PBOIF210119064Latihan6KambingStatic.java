/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan6.kambingstatic;

/**
 *
 * @author
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini berisi program untuk mendeklarasian variabel 
 * static dan mengakses variabel static pada main program
 */
public class PBOIF210119064Latihan6KambingStatic {

    /**
     * @param args the command line arguments
     */
    
    //NAMA_KAMBING sebagai
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Aldy
 */
public class Saldo {
    
    
    private int saldoAwal;
    private int bonus = 500;
    private int bulan = 5;
    private int saldoAkhir;
    
    public void setAwal(int saldoAwal) {
        this.saldoAwal = saldoAwal;
    }
    
    
        
    public void Target(){
        int i =1;
        while (i <= bulan){
            saldoAkhir = (saldoAwal + bonus);
            System.out.println("Saldo di bulan ke-" + i + " Rp. " + saldoAkhir);
            saldoAwal=saldoAkhir;
            i++;
        }
    }
}

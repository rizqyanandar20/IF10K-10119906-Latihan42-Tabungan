/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan42.tabungan;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda Rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 */
public class Tabungan {
    private int saldo;

    public Tabungan (int saldo){
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah){
        return this.saldo - jumlah;
    }
}

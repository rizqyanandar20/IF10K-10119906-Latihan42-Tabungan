/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan42.tabungan;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 */
public class IF10K10119906Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo, jumlah;
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Program Penarikan Uang=====");
        System.out.print("Masukkan Saldo Awal\t\t: ");
        saldo = scanner.nextInt();
        System.out.print("Jumlah uang yang diambil\t: ");
        jumlah = scanner.nextInt();
        Tabungan tabung = new Tabungan(saldo);
        System.out.println("Saldo Anda Sekarang\t\t: "+tabung.ambilUang(jumlah));
    }
    
}

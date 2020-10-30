/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan28.gantikata;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : Rizqy Ananda RUsmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Deskripsi Program : mengganti kata dalam sebuah kalimat, menggunakan inputan.
 */
public class IF10K10119906Latihan28GantiKata {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String kalimatAwal, kalimatBaru, kataDiganti, kataPengganti;

        System.out.println("====Program Mengganti Kata====\n");

        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = scanner.nextLine();

        System.out.print("Ganti Kata : ");
        kataDiganti = scanner.nextLine();

        System.out.print("Menjadi Kata : ");
        kataPengganti = scanner.nextLine();

        kalimatBaru = kalimatAwal.replace(kataDiganti, kataPengganti);

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimatAwal);
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
    
}

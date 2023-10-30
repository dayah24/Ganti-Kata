/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166034_latihan28_gantikata;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 * Nama     : Nur Hidayah
 * Kelas    : PBO 028
 * NIM      : 22166034
 * Deskripsi Program : Ganti Kata
 */
public class SI_RegPagi_22166034_Latihan28_GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("======Program Mengganti Kata======");
         System.out.println();
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();

        System.out.print("Ganti Kata: ");
        String kataLama = scanner.nextLine();

        System.out.print("Menjadi Kata: ");
        String kataBaru = scanner.nextLine();

        System.out.println("======Hasil Formatting======");
         System.out.println();
         
        // Melakukan penggantian kata
        String kalimatAwal = kalimat.replace(kataLama, kataLama);
        String kalimatBaru = kalimat.replace(kataLama, kataBaru);

        System.out.println("Kalimat awal: " + kalimatAwal);
        System.out.println("Kalimat Baru: " + kalimatBaru);
    }
}
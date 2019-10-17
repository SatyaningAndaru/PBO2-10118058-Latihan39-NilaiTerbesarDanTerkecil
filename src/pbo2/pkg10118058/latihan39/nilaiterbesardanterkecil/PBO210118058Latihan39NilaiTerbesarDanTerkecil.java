/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210118058Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Petugas ptg = new Petugas();
        daftarNilai nilai = new daftarNilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptg.inputPetugas();
        nilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<nilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            nilai.nilaiMhs[i] = scn.nextInt();
            nilai.hitungNilaiTerbesar(i);
            nilai.hitungNilaiTerkecil(i);
        }
        nilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah " + nilai.nBesar);
        System.out.println("Nilai Terkecil adalah " + nilai.nKecil);

        System.out.print("\nPetugas : " + ptg.namaPetugas);
        System.out.println("Developed by Satyaning Andaru");
        System.out.println();
    }
    
}

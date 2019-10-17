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
class Petugas {
    public String namaPetugas;
    daftarNilai nilai = new daftarNilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scn.next();
    }
}

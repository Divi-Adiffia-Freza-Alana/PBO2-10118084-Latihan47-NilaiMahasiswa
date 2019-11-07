/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung nilai akhir

 */
public class PBO21011084Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        nilai nilai = new nilai();
        System.out.print("QUIZ         =");nilai.setQuiz(scanner.nextDouble());
        System.out.print("UTS          =");nilai.setUts(scanner.nextDouble());
        System.out.print("UAS          =");nilai.setUas(scanner.nextDouble());
        System.out.println("Nilai Akhir  ="+nilai.nilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas()));
        nilai.index(nilai.getNilaiAkhir());
        nilai.keterangan(nilai.getNilaiAkhir());
    }
    
}

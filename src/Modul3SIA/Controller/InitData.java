/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3SIA.Controller;

import Modul3SIA.Model.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author juand
 */
public class InitData {

    ArrayList<Presensi> listPresensi1 = new ArrayList();
    ArrayList<MatkulAmbil> listMatkul1 = new ArrayList();
    ArrayList<MatkulAmbil> listMatkul2 = new ArrayList();
    LinkedList<MhsSarjana> daftarMhsSarjana = new LinkedList();
    LinkedList<MhsMagister> daftarMhsMagister = new LinkedList();
    LinkedList<MhsDoktor> daftarMhsDoktor = new LinkedList();
    ArrayList<PresensiStaff> listPresensiStaff1 = new ArrayList();
    ArrayList<MatkulAjar> listMatkulDiajar1 = new ArrayList();
    ArrayList<MatkulAjar> listMatkulDiajar2 = new ArrayList();
    LinkedList<DosenTetap> daftarDosenTetap = new LinkedList();
    LinkedList<DosenHonorer> daftarDosenHonorer = new LinkedList();
    LinkedList<Karyawan> daftarKaryawan = new LinkedList();

    public InitData() {

        listPresensi1.add(new Presensi("21/06/2021", 1));
        listPresensi1.add(new Presensi("23/06/2021", 1));
        listPresensi1.add(new Presensi("25/06/2021", 0));

        listMatkul1.add(new MatkulAmbil(listPresensi1, 90, 60, 72, "IF-101", 4, "Struktur Data"));
        listMatkul1.add(new MatkulAmbil(listPresensi1, 70, 62, 80, "IF-202", 3, "PBO"));
        listMatkul2.add(new MatkulAmbil(listPresensi1, 50, 30, 40, "IF-101", 4, "Struktur Data"));
        listMatkul2.add(new MatkulAmbil(listPresensi1, 50, 82, 80, "IF-222", 3, "PBO Magister"));
        listMatkul2.add(new MatkulAmbil(listPresensi1, 77, 90, 92, "IF-121", 4, "Struktur Data Magister"));

        daftarMhsSarjana.add(new MhsSarjana(listMatkul1, "1121010", "Sistem Informasi", "Sarjana Udin", "Rumah Udin", "Rumah Sakit Persalinan - 2003", "08380011"));
        daftarMhsSarjana.add(new MhsSarjana(listMatkul2, "1121012", "Sistem Informasi", "Sarjana Udin2", "Rumah Udin2", "Rumah Sakit Persalinan2 - 2003", "08380011"));
        daftarMhsDoktor.add(new MhsDoktor("Penelitian A", 70, 90, 92, "1118020", "Informatika", "Doktor Budi", "Rumah Budi", "Rumah Sakit Budi - 2000", "14045"));
        daftarMhsDoktor.add(new MhsDoktor("Penelitian A2", 72, 92, 94, "1118022", "Informatika", "Doktor Budi2", "Rumah Budi2", "Rumah Sakit Budi2 - 2000", "14045"));
        daftarMhsMagister.add(new MhsMagister("Judul Tesis", listMatkul1, "2101021", "Teknik Komputer", "Magister Asep", "Rumah Asep", "RS Asep - 1990", "121212"));
        daftarMhsMagister.add(new MhsMagister("Judul Tesis2", listMatkul2, "2101022", "Teknik Komputer", "Magister Asep2", "Rumah Asep2", "RS Asep2 - 1990", "121212"));

        listPresensiStaff1.add(new PresensiStaff(2, "22/01/2021", 1));
        listPresensiStaff1.add(new PresensiStaff(3, "24/01/2021", 1));
        listPresensiStaff1.add(new PresensiStaff(1, "27/01/2021", 0));

        listMatkulDiajar1.add(new MatkulAjar(listPresensiStaff1, "SI-221", 3, "Strategi Algoritmik"));
        listMatkulDiajar2.add(new MatkulAjar(listPresensiStaff1, "TI-221", 4, "Advance Industry System"));

        daftarDosenTetap.add(new DosenTetap(5000000, "Departemen SI", listMatkulDiajar1, "090101", "Pak Heri", "Rumah Pak Heri", "RS - 1980", "085120201"));
        daftarDosenTetap.add(new DosenTetap(6000000, "Departemen SI", listMatkulDiajar2, "090102", "Pak Heri2", "Rumah Pak Heri2", "RS2 - 1980", "085120201"));
        daftarDosenHonorer.add(new DosenHonorer(500000, "Departenmen TI", listMatkulDiajar1, "080101", "Pak Honorer", "Rumah Pak Honorer", "RS - 1985", "08382032"));
        daftarDosenHonorer.add(new DosenHonorer(600000, "Departenmen TI", listMatkulDiajar2, "080102", "Pak Honorer2", "Rumah Pak Honorer2", "RS2 - 1985", "08382032"));
        daftarKaryawan.add(new Karyawan(4000000, listPresensiStaff1, "070021", "Karyawan Agus", "Rumah Agus", "RS Agus - 1999", "0021856"));
        daftarKaryawan.add(new Karyawan(5000000, listPresensiStaff1, "070022", "Karyawan Agus2", "Rumah Agus2", "RS Agus2 - 1999", "0021856"));

    }
//    public static void main(String[] args) {
//        InitData data = new InitData();
//    }
}

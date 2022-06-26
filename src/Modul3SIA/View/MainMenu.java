/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3SIA.View;
import Modul3SIA.Controller.Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class MainMenu {
    Controller controller = new Controller();
    public MainMenu() {
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Print User Data\n"
                    + "2. Print Nilai Akhir\n"
                    + "3. Print Rata-Rata Nilai Akhir\n"
                    + "4. Print banyak mahasiswa yang tidak lulus matkul tertentu\n"
                    + "5. Print matkul yang diambil untuk mahasiswa tertentu\n"
                    + "6. Print total berapa jam dosen masuk kelas dan mengajar\n"
                    + "7. Print Gaji staff\n"
                    + "8. Exit"));
            switch (menu) {
                case 1:
                    printUserData();
                    break;
                case 2:
                    printNilaiAkhir();
                    break;
                case 3:
                    printRataNilaiAkhir();
                    break;
                case 4:
                    printMhsTidakLulus();
                    break;
                case 5:
                    printMatkulAmbilMhs();
                    break;
                case 6:
                    printJamAjarDosen();
                    break;
                case 7:
                    printGaji();
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Terima kasih, anda akan dikeluarkan dari aplikasi...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input user tidak tersedia!!!");
            }
        } while (menu != 8);
    }
    private void printUserData(){
        String nama = JOptionPane.showInputDialog("Input nama: ");
        String output = controller.userData(nama);
        JOptionPane.showMessageDialog(null, output);
    }
    private void printNilaiAkhir(){
        String nim = JOptionPane.showInputDialog("Input NIM Mahasiswa: ");
        String kodeMK = JOptionPane.showInputDialog("Input kode matkul:");
        double nilaiAkhir = controller.nilaiAkhir(nim, kodeMK);
        JOptionPane.showMessageDialog(null, "Nilai akhir mahasiswa adalah "+nilaiAkhir);
    }
    private void printRataNilaiAkhir(){
        String kodeMK = JOptionPane.showInputDialog("Input kode MK: ");
        double rataNilaiAkhir = controller.rataNilaiAkhir(kodeMK);
        JOptionPane.showMessageDialog(null, "Rata-rata nilai akhir mahasiswa di Matkul tersebut adalah "+rataNilaiAkhir);
    }
    private void printMhsTidakLulus(){
        String kodeMK = JOptionPane.showInputDialog("Input kode MK: ");
        String mhsTidakLulus = controller.cekLulus(kodeMK);
        JOptionPane.showMessageDialog(null, mhsTidakLulus);
    }
    private void printMatkulAmbilMhs(){
        String nim = JOptionPane.showInputDialog("Input NIM: ");
        String matkulAmbil = controller.presensiMatkul(nim);
        JOptionPane.showMessageDialog(null, matkulAmbil);
    }
    private void printJamAjarDosen(){
        String nik = JOptionPane.showInputDialog("Input NIK: ");
        int jamAjar = controller.jamDosenNgajar(nik);
        JOptionPane.showMessageDialog(null, "Total jam dosen masuk kelas adalah "+jamAjar+" jam.");
    }
    private void printGaji(){
        String nik = JOptionPane.showInputDialog("Input NIK: ");
        int gaji = controller.hitungGaji(nik);
        JOptionPane.showMessageDialog(null, "Gaji staff adalah "+gaji+" rupiah");
    }
}

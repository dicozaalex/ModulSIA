/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3SIA.Model;

/**
 *
 * @author juand
 */
import java.util.ArrayList;
public class MatkulAmbil extends MataKuliah{
    protected ArrayList<Presensi>listPresensi = new ArrayList();
    protected int n1;
    protected int n2;
    protected int n3;

    public MatkulAmbil(ArrayList<Presensi>listPresensi, int n1, int n2, int n3, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.listPresensi = listPresensi;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatkulAmbil{" + "listPresensi=" + listPresensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }
    
}

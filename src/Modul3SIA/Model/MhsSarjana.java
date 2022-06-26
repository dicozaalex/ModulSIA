/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3SIA.Model;

import java.util.ArrayList;
/**
 *
 * @author juand
 */
public class MhsSarjana extends Mahasiswa{
    protected ArrayList<MatkulAmbil> listMatkul = new ArrayList();
    public MhsSarjana(ArrayList<MatkulAmbil> listMatkul, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.listMatkul = listMatkul;
    }

    public ArrayList<MatkulAmbil> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MatkulAmbil> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMhsSarjana{" + "listMatkul=" + listMatkul + '}';
    }
    
    
}

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
public class MhsMagister extends Mahasiswa {
    protected ArrayList<MatkulAmbil> listMatkul = new ArrayList();
    protected String judulTesis;

    public MhsMagister(String judulTesis, ArrayList<MatkulAmbil> listMatkul, String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(NIM, jurusan, nama, alamat, TTL, telepon);
        this.judulTesis = judulTesis;
        this.listMatkul = listMatkul;
    }

    public ArrayList<MatkulAmbil> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<MatkulAmbil> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public String getJudulTesis() {
        return judulTesis;
    }

    public void setJudulTesis(String judulTesis) {
        this.judulTesis = judulTesis;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMhsMagister{" + "listMatkul=" + listMatkul + ", judulTesis=" + judulTesis + '}';
    }

    
}

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
public class MatkulAjar extends MataKuliah{
    protected ArrayList<PresensiStaff>listPresensiStaff = new ArrayList();

    public MatkulAjar(ArrayList<PresensiStaff>listPresensiStaff, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.listPresensiStaff = listPresensiStaff;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatkulAjar{" + "listPresensiStaff=" + listPresensiStaff + '}';
    }
    
}

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

public abstract class Dosen extends Staff{
    protected String departemen;
    protected ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList();

    public Dosen(String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
        this.listMatkulDiajar = listMatkulDiajar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public void setListMatkulDiajar(ArrayList<MatkulAjar> listMatkulDiajar) {
        this.listMatkulDiajar = listMatkulDiajar;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDosen{" + "departemen=" + departemen + ", listMatkulDiajar=" + listMatkulDiajar + '}';
    }
    
}

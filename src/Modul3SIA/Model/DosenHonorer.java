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
public class DosenHonorer extends Dosen{
    protected int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, listMatkulDiajar, NIK, nama, alamat, TTL, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDosenHonorer{" + "honorPerSKS=" + honorPerSKS + '}';
    }
    
    
}

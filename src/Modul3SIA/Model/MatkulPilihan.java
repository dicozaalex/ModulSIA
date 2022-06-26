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
public class MatkulPilihan extends MataKuliah{
    protected String minMhs;

    public MatkulPilihan(String minMhs, String kode, int SKS, String nama) {
        super(kode, SKS, nama);
        this.minMhs = minMhs;
    }

    public String getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(String minMhs) {
        this.minMhs = minMhs;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMatkulPilihan{" + "minMhs=" + minMhs + '}';
    }
    
}

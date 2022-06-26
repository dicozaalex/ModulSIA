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
public class PresensiStaff extends Presensi{
    protected int jam;

    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }
    
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "PresensiStaff{" + "jam=" + jam + '}';
    }
    
}

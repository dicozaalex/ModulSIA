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
public class Presensi implements InterfaceStatus{
    protected String tanggal;
    protected int status;

    public Presensi(String tanggal, int status) {
        this.tanggal = tanggal;
        this.status = status;
    }
    
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + status + '}';
    }
    
}

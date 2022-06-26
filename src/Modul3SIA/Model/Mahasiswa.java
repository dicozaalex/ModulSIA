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
public abstract class Mahasiswa extends User{
    protected String NIM;
    protected String jurusan;

    public Mahasiswa(String NIM, String jurusan, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMahasiswa{" + "NIM=" + NIM + ", jurusan=" + jurusan + '}';
    }
    
}

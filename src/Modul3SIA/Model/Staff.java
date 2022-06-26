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
public abstract class Staff extends User{
    protected String NIK;

    public Staff(String NIK, String nama, String alamat, String TTL, String telepon) {
        super(nama, alamat, TTL, telepon);
        this.NIK = NIK;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" + "NIK=" + NIK + '}';
    }
    
}

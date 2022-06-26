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
public class Karyawan extends Staff{
    protected int salary;
    protected ArrayList<PresensiStaff> listPresensiStaff = new ArrayList();

    public Karyawan(int salary, ArrayList<PresensiStaff> listPresensiStaff, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKaryawan{" + "salary=" + salary + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

    
}

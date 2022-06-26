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
public class DosenTetap extends Dosen{
    protected int salary;

    public DosenTetap(int salary, String departemen, ArrayList<MatkulAjar> listMatkulDiajar, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(departemen, listMatkulDiajar, NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDosenTetap{" + "salary=" + salary + '}';
    }
    
    
}

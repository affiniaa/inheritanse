/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_2;

/**
 *
 * @author SMK TELKOM
 */
public class Employ  extends Person{
    private final String noKaryawan;
    
    //konstruktor
    public Employ(String noKaryawan,String nama, int usia) {
        super(nama, usia);
        this.noKaryawan =noKaryawan;
    }
    
    //metode
    public void info(){
        System.out.println("No. Karyawan :"+this.noKaryawan);
        super.info();
    }
}

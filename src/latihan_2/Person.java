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
public class Person {
    private final String nama;
    private final int usia;
    
    //konstruktur
    public Person (String nama,int usia){
        this.nama =nama;
        this.usia=usia;
    }
    
    //method
    public void info(){
        System.out.println("Nama :"+this.nama);
        System.out.println("usia :"+this.usia);
    }
}

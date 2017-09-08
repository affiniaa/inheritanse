/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_4;

/**
 *
 * @author SMK TELKOM
 */
public class DemoOverride2 {
    public static void main (String[]args){
        B obj=new B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggail method yg terdapat pada class A
        obj.tampilkanNilai();
    }
}

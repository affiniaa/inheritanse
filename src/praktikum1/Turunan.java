/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author SMK TELKOM
 */
public class Turunan extends Induk{
    public void test(String a){
    System.out.println("Method overload didalam kelas turunan");
    System.out.println("A:\""+a+"\"");
    }
    
    public void test(){
       System.out.println("Method overload didalam kelas turunan"); 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author DONY-SAMDHILA
 */
class Pertama {
    private int a = 10;
    
    protected void terlindungi () {
        System.out.println ("Method ini hanya untuk anaknya");
    }
    
    protected void info () {
        System.out.println ("a = "+a);
        System.out.println ("Dipanggil pada = "+this.getClass().getName());
    }
}

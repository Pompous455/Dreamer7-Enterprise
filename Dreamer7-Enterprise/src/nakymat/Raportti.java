/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakymat;


public class Raportti {
    
    private String nimi;
    private int numero;
    private int maara;
    private float kesto;
    private String teksti;
    
    public Raportti(String nimi, int numero, int maara, float kesto, String teksti){
        this.nimi = nimi;
        this.numero = numero;
        this.maara = maara;
        this.kesto = kesto;
        this.teksti = teksti;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
}

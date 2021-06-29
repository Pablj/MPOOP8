/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop8;

/**
 *
 * @author drago
 */
public class Flauta extends InstrumentoViento {
    
    
    public void tocarHimnoAlaAlegria(){
        System.out.println("Tocando himno a la alegria");
        
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }
}

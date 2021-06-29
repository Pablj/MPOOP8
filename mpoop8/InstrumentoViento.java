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
public class InstrumentoViento extends Object   implements InstrumentoMusical{

    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando");
    }

    @Override
    public String tipoInstrumento() {
        return "Inst de viento";
    }
    
    
}

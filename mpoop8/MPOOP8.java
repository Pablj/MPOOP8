/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop8;

/**
 *
 * @author Cruz Morales Pablo, García Acosta Osvaldo Levent
 */
public class MPOOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono poligono;//poligono->null
        poligono=new Poligono();//poligono->obj creado
        System.out.println(poligono);
        
        Object objeto=poligono;//Obj->a lo que apunta poligono
                               //obj-> a obj creado por Poligono
        System.out.println(objeto);
        //Una referencia puede ser reasignada a otros objetos
        poligono=new Triangulo();
        System.out.println(poligono);
        System.out.println(objeto);
        
        objeto=new Cuadrilatero();
        System.out.println(objeto);
        
        poligono.area();
        
      
        queTipoEs(poligono);
        poligono=new Cuadrilatero();
        queTipoEs(poligono);
        
        
        System.out.println("########### Interfaz #########");
        //Se puede crear una referencia a la interfaz, pero no inicializarla
        InstrumentoMusical inst;
        //inst=new InstrumentoMusical
        
        
        //Una referencia a la interfaz ouede ser asignada cualquier objeto que la implemente//
        inst=new Flauta();
        inst.tocar();
        System.out.println(inst.tipoInstrumento());
        
        
        
        
        
        
        
        
        
        
    }  
    public static void queTipoEs(Poligono p){
        if (p instanceof Triangulo) {
            Triangulo t=(Triangulo) p;
            System.out.println("Triangulo con base"+t.getBase());
            
        }else if(p instanceof Cuadrilatero) {
            Cuadrilatero c=(Cuadrilatero)p;
            System.out.println("Cuadrado con base"+c.getBase());
            
        }
    }
}

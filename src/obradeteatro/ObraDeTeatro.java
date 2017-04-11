/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obradeteatro;

/**
 *
 * @author tatan
 */
public class ObraDeTeatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Obra miobra = new Obra();
       Actor prota = new Actor("Hola",miobra);
       Actor anta = new Actor("caho ", miobra);
       Actor secu = new Actor ("wena", miobra);
       
       
       miobra.setProtagonista(prota);
       miobra.setAntagonista(anta);
       miobra.setSecundario(secu);
       
       
      
      
       
        System.out.println( anta.getLinea());
        System.out.println(prota.getLinea());
        System.out.println( secu.getLinea());
     
    }
    
}

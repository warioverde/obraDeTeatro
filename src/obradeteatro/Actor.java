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
public class Actor {
   private String linea;
   //
   private Obra protagonizado;
   private Obra antagonizado;
   private Obra secundariado;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    

    public Actor(String linea, Obra protagonizado, Obra antagonizado, Obra secundariado) {
        this.linea = linea;
        this.protagonizado = protagonizado;
        this.antagonizado = antagonizado;
        this.secundariado = secundariado;
    }

    
   

    
    
}

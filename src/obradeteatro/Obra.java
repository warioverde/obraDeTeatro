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
public class Obra {
    private Actor protagonista;
    private Actor antagonista;
    private Actor secundario;

    public Actor getProtagonista() {
        return protagonista;
    }

    

    public Actor getAntagonista() {
        return antagonista;
    }

    

    public Actor getSecundario() {
        return secundario;
    }


//   //*nunca hacer constructores con asociacones public Obra() {
//        this.protagonista = new Actor("Romeo , romeo....",this);
//        this.antagonista = new Actor("Yo mate a romeo",this);
//        this.secundario = new Actor("¿por que lo has matado?",this);
//    }
    public void interpretar(){
        Obra miobra = new Obra();
        System.out.println(antagonista.getLinea());
        System.out.println(antagonista.getLinea());
        System.out.println(secundario.getLinea());
        
        
        
        
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    public void setAntagonista(Actor antagonista) {
        this.antagonista = antagonista;
    }

    public void setSecundario(Actor secundario) {
        this.secundario = secundario;
    }

    
    
    

    
    
    
     
     
    
     
     
     
}

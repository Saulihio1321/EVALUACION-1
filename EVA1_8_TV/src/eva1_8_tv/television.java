/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_tv;

/**
 *
 * @author invitado
 */
class television {
    // atributos
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    public void subirVolumen(){
        if (estaEncendida == true)
        volumen = volumen + 1;
        //volumen +=1;
        //volumen ++;
    }
    public void bajarVolumen(){ 
        if (estaEncendida == true)    
        volumen = volumen - 1;
    }
    public void subirCanal(){
        if (estaEncendida == true)
        canal = canal + 1;
        //volumen +=1;
        //volumen ++;
    }
    public void bajarCanal(){ 
        if (estaEncendida == true)
            canal = canal - 1;
    }
    public void cambiarCanal(int noCanal){
    canal = noCanal;
    }
    public void power (){
    /*if(estaEncendida == true)
        estaEncendida = false;
    else 
        estaEncendida = true;*/
        estaEncendida  = !estaEncendida;
    }
    public void imprimirConfig(){
           System.out.println("volumen " + volumen);
           System.out.println("canal " + canal);
           System.out.println("power " + estaEncendida);
           
                    
            }
}

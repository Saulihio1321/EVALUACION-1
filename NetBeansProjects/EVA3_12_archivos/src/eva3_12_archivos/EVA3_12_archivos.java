/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author invitado
 */
public class EVA3_12_archivos {
final static String miRuta = "C:\\archivos\\archi_texto";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       try{
       leerArchivofiles(miRuta);
       
       }catch(Exception e){
       }
    }
    /*
    Lectura de archivos usando la clase files
    se lee todo el atchivo y se carga en memoria
    Por lo tanto es util solo para archivos pequeñoa
    
    */
    
    public static void leerArchivosFiles(String ruta) throws IOException{
        System.out.println("lectura de archivos de texto con clase file");
        Path path = Paths.get(ruta);//crea una ruta de tipo path
        byte[] datos = Files.readAllBytes(path);//genera una IOExeption
       //new string comvierte el arreglo de byte a linea de texto
        System.out.println(new String (datos));
        
                
                
                
    }

    private static void leerArchivofiles(String miRuta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

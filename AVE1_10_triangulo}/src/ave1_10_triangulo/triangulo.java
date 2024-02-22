/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ave1_10_triangulo;

/**
 *
 * @author invitado
 */
class triangulo {
        private double base;
       private double altura;

       public triangulo(){
           base = -1;
           altura = -1;
       }

       public void setbase(double valor){
           base = valor;
       }
       public void setaltura(double valor){
           altura = valor;

       }
       public double getbase(){
           return base;
       }
       public double getaltura(){
           return altura;
       }
       private double caldularArea(){
           return (base * altura) / 2;
       }
       private double calculaPeri(){
           double peri;
           //suma de los 3 datos, falta el lado mayor (la hipotenusa)
           //peri ????????????????????????
          peri = base + altura + (Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)));
           return peri;
       }
       public void imprimirDatos(){
           System.out.println("el area del triangulo es: ");
           System.out.println("el perimetro del triangulo es :");
       }

    
}

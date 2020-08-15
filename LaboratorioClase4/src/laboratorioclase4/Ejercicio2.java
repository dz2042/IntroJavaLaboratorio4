/*
Ejercicio:
Imprimir los números del 1 al 10 uno abajo del otro      

Solucion:
Se define que la clase reciba 2 variables y que loope segun lo que se pidio de a 2

Author: Dz2042
Fecha: 2020-08-05

*/
package laboratorioclase4;

public class Ejercicio2 {
   public static void main() {
       int multi = 0;
       //Imprimo ejercicio
       String linea = "---------------------------------";
       System.out.println(linea);
       System.out.println("       Ejercicio 2");
       System.out.println(linea);
       
       int diasAgosto = 7 ;
	   //definimos e inicializamos un array de datos float 
	   float[] temperaturasAgosto = new float [diasAgosto];
	   float sumaDeTemperaturas = 0 ;//variable de tipo acumulador 
	   float promedioTemperaturas = 0;

       for (int i = 0; i < temperaturasAgosto.length; i++){
    	   temperaturasAgosto[i] = PedirValor.PerdirFloat("Ingrese Temperatura maxima del dia " + (i + 1) + ":");
       }
       
       for(int j = 0; j < temperaturasAgosto.length; j++) {
    	   if (j==0) {
    		   System.out.print(temperaturasAgosto[j]);
    	   }else {
    		   System.out.print(" - " + temperaturasAgosto[j]);   
    	   }
    	   
    	   sumaDeTemperaturas += temperaturasAgosto[j];
       }
       System.out.println("");
       System.out.println("Sumatoria: " + sumaDeTemperaturas);
       promedioTemperaturas = sumaDeTemperaturas / diasAgosto;
       System.out.println("Promedio: " + promedioTemperaturas);
   }   
}

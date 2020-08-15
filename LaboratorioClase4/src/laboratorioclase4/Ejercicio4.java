/*
Ejercicio:
Imprimir los números del 1 al 10 sin imprimir números 2,5 y 9 uno abajo del otro

Solucion:
Se define que la clase reciba 2 variables y que loope segun lo que se pidio, 
Con excepcion de Algunos Valores valores

Author: Dz2042
Fecha: 2020-08-05

*/
package laboratorioclase4;
import java.util.Scanner;
import java.util.Vector;

public class Ejercicio4 {
    public static void main(int nro1, int nro2, int[] vExcep, int maxQ){
        double valor1 = 0, valor2 = 0, resultado = 0;
        int opcion = 0;
        boolean isok = false;
        Scanner teclado = new Scanner(System.in);
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 4");
        System.out.println(linea);
        //Imprimo variables recibidas
        System.out.println("Desde = " + nro1);
        System.out.println("Iteraciones = " + nro2);
        
        //Logica
        int iteracion, cont, valor;
        boolean isOk = false;
        System.out.println("Capacity = " + maxQ);
        cont = 0;
        do{
 
            System.out.println("Item " + cont + " Valor " + vExcep[cont] );
            
            cont++;
        }while(cont < maxQ);
        for(iteracion = 1; iteracion <= nro2; iteracion++){
            isOk = true;
            cont = 0;
            valor = (nro1 + iteracion);
            do{
                
                if (vExcep[cont] == valor ){
                    isOk = false;
                    //System.out.println("Entro" + valor);
                    //cont = maxQ;
                    break;
                }
                cont++;
            }while(cont < maxQ);
            if (isOk) {
                System.out.println("Iteracion " + iteracion + " - Valor: " + valor);
            }
        }
    }
}

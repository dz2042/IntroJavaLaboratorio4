/*
Ejercicio:
Dado el vector {10,20,5,15,30,20}
Informar el vector de la forma: "Índice: X, Valor: Y"
Totalizar el vector e informar el total
Informar el contenido de las posiciones impares (por ejemplo, las posiciones 1,3,5,etc)
Informar el mayor número
Informar cuántas veces aparece el número 20


Author: Dz2042
Fecha: 2020-08-05

*/
package laboratorioclase4;

public class Ejercicio1 {
    public static void main(int[] vVecEje1) {
        //Imprimo Ejercicio
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Ejercicio 1");
        System.out.println(linea);
        int suma = 0;
        int q20 = 0;
        int max = 0;
        int pos = 0;
        int[] vImpar = new int[10];
        int posVImpar = 0;
        for(int i = 0; i < vVecEje1.length; i++) {
        	pos++;
        	System.out.println("Indice: " + pos + " Valor:" + vVecEje1[i]);
        	suma += vVecEje1[i];
        	if(vVecEje1[i] == 20)
        		q20++;
        	if(vVecEje1[i] > max)
        		max = vVecEje1[i];
        	if (vVecEje1[i]%2 != 0) {
        		vImpar[posVImpar] = vVecEje1[i];
        		posVImpar++;
        	}
        		
        }
        System.out.println("Cantidad: " + pos);
        System.out.println("Total: " + suma);
        System.out.println("Maximo: " + max);
        System.out.println("Impares:");
        for(int i = 0; i < vImpar.length; i++) {
        	if (vImpar[i] != 0)  
        	System.out.println(vImpar[i]);
        }
        
    }
            
}


package laboratorioclase4;

import java.util.Scanner;

public class Bonus {
    public static void Bonus1 (){
        /*
        
        Desarrollar un algoritmo que permita ingresar letras mayúsculas y que
        las muestre por pantalla. El programa debe finalizar cuando se hayan
        ingresado 10 letras mayúsculas.

        */
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 1");
        System.out.println(linea);
        
        int limite = 10, contador = 0, ascii;
        char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Letras Mayusculas, El Programa "
                + "Finalizara cuando se hayan ingresado " + limite + "letras mayusculas");
        do{
            do{
                letra = teclado.next().charAt(0);

            //}while(!Character.isUpperCase(letra));
            }while(letra < 'A' || letra > 'Z'); //que pajero!!!!!!
            System.out.println("LetraMay: " + letra);
            contador++;
        }while(contador < limite);
        
    }
    public static void Bonus2 (){
        /*
        
        Leer 20 números e imprimir cuantos son positivos , 
        cuantos negativos y cuantos neutros


        */
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 2");
        System.out.println(linea);
        
        int limite = 10, contador = 0, ascii, aux, positivo = 0, negativo = 0, neutro = 0;
        char letra;
        Scanner teclado = new Scanner(System.in);
        for(contador = 0; contador < limite; contador++){
            aux = PedirValor.PerdirInt("Ingrese Valor " + (contador + 1) + " = ");
            if(aux > 0){
                positivo++;
            }else if(aux == 0){
                neutro++;
            }else if (aux <= 0){
                negativo++;
            }
        }
        System.out.println("Positivos = " + positivo);
        System.out.println("Neutro = " + neutro);
        System.out.println("Negativo = " + negativo);
    }
    public static void Bonus3 (){
        /*
        
        simular relog


        */
        String linea = "---------------------------------";
        System.out.println(linea);
        System.out.println("       Bonus 3");
        System.out.println(linea);
        
        for (int hs = 0; hs <= 23; hs++){
            for (int min = 0; min <= 59; min++){
                for (int seg = 0; seg < 59; seg++){
                    System.out.println(hs + ":" + min + ":" + seg);

                }
            }
        }

    }
}

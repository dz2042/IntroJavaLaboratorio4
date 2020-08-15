/*
Ejercicios del Laboratorio 3.
Se presenta un menu de ejcuciÃ³n de Cada Ejercicio

Author: DZ2042
Fecha: 2020-08-05
*/
package laboratorioclase4;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) {
        
        String linea = "---------------------------------";
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println(linea);
        System.out.println("       Laboratorio 4");
        System.out.println(linea);
        System.out.println("");
        
        do{
            System.out.println(linea);
            System.out.println("Seleccione El Ejercicio a Ejecutar:");
            System.out.println(linea);
            System.out.println("1 - Ejercicio 1.");
            System.out.println("2 - Ejercicio 2.");
            System.out.println("3 - Ejercicio 3.");
            System.out.println("4 - Ejercicio 4.");
            System.out.println("21 - Bonus 1.");
            System.out.println("22 - Bonus 2.");
            System.out.println("23 - Bonus 3.");
            System.out.println("99 - Salir.");
            System.out.println("");
            System.out.print("Ingrese Opción:");
            if(teclado.hasNextInt()){
                   opcion = teclado.nextInt();
                   menu(opcion);
            }else{
                teclado.nextLine();
                System.out.println("Ingrese un valor Valido");
            }     
        }while(opcion != 99);                
    }
    
    public static void menu(int opcion){
        boolean ingresoOk = false;
        int[] vExcep = new int[3];
        int nro1, nro2, nro3, aux;
        String usuario, password;
        switch (opcion){
            case 1:
            	int[] vVecEje1 =  {10,20,5,15,30,20};
                Ejercicio1.main(vVecEje1);
                break;
            case 2:
                System.out.println("");
                Ejercicio2.main();
                break;
            case 3:
                System.out.println("");
                nro1 = PedirValor.PerdirInt("Ingrese Valor desde = ");
                do {
                nro2 = PedirValor.PerdirInt("Ingrese cantidad de iteraciones = ");
                }while(nro2 <= 0);
                Ejercicio3.main(nro1, nro2);
                break;
            case 4:
                System.out.println("");
                nro1 = PedirValor.PerdirInt("Ingrese Valor desde = ");
                do {
                nro2 = PedirValor.PerdirInt("Ingrese cantidad de iteraciones = ");
                }while(nro2 <= 0);
                aux = PedirValor.PerdirInt("Exepcion 1 = ");
                vExcep[0] = aux;
                aux = PedirValor.PerdirInt("Exepcion 2 = ");
                vExcep[1] = aux;
                aux = PedirValor.PerdirInt("Exepcion 3 = ");
                vExcep[2] = aux;
                aux = 3;
                Arrays.sort(vExcep);
                Ejercicio4.main(nro1, nro2, vExcep, aux);
                break;
            case 21:
                Bonus.Bonus1();
                break;
            case 22:
                Bonus.Bonus2();
                break;
            case 23:
                Bonus.Bonus3();
                break;
            case 99:
                break;
            default:
                System.out.println("Opción inválida.");
        }   
    }
}

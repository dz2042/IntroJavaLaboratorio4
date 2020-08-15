/* 
La idea de esta clase es que sirva como algo generico para el pedido de valores,
Tonces cada vez que se necesita un vañlor simple para una variable se la invoque
Author: dz2042
Fecha:2020-07-29
*/
package laboratorioclase4;
import java.util.Scanner;

public class PedirValor {
    //Este metodo Sirve para pedir un entero
    public static int PerdirInt (String Mensaje){
        int rta = 0;
        boolean ingresoOk = false;
        Scanner tecladoM = new Scanner(System.in);
        do {
            System.out.print(Mensaje);
            if(tecladoM.hasNextInt()){
                    rta = tecladoM.nextInt();
                    ingresoOk = true;
             }else{
                 tecladoM.nextLine();
                 ingresoOk = false;
                 System.out.println("Ingrese un valor Valido");
             }     
        } while(!ingresoOk);
        return rta;
    }
    //Este metodo Sirve para pedir un Double
    public static double PerdirDouble (String Mensaje){
        double rta = 0;
        boolean ingresoOk = false;
        Scanner tecladoM = new Scanner(System.in);
        do {
            System.out.print(Mensaje);
            if(tecladoM.hasNextDouble()){
                    rta = tecladoM.nextDouble();
                    ingresoOk = true;
             }else{
                 tecladoM.nextLine();
                 ingresoOk = false;
                 System.out.println("Ingrese un valor Valido");
             }     
        } while(!ingresoOk);
        return rta;
    }
    //Este metodo Sirve para pedir un Float
    public static float PerdirFloat (String Mensaje){
        float rta = 0;
        boolean ingresoOk = false;
        Scanner tecladoM = new Scanner(System.in);
        do {
            System.out.print(Mensaje);
            if(tecladoM.hasNextFloat()){
                    rta = tecladoM.nextFloat();
                    ingresoOk = true;
             }else{
                 tecladoM.nextLine();
                 ingresoOk = false;
                 System.out.println("Ingrese un valor Valido");
             }     
        } while(!ingresoOk);
        return rta;
    }
    //Este metodo Sirve para pedir un String
    public static String PerdirString (String Mensaje){
        String rta = "";
        System.out.print(Mensaje);
        Scanner tecladoM = new Scanner(System.in);
        rta = tecladoM.nextLine();
        return rta;
    }
}

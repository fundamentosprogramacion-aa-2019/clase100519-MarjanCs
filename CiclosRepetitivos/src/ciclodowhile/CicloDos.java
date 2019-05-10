
package ciclodowhile;

import java.util.Scanner;

public class CicloDos {

    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        String cadena = "";
        int tabla ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nro que desee multiplicar");
        
        tabla = sc.nextInt();
        do{ 
            int valor = contador * tabla;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, contador,
                    valor);
            contador = contador + 1;
        }while (contador<=5) ;
        
        System.out.printf("%s", cadena);
        
    }
        
 }
    
    


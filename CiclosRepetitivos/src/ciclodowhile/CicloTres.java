
package ciclodowhile;

import java.util.Scanner;

public class CicloTres {

    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "";
        String apellidos = "";
        String nombres = "";
        int edad = 0;
        int sumaEdades = 0;
        double promedioEdades = 0;
        boolean bandera = true ;
        int contador = 0;
        String valorUsuario;
        Scanner sc = new Scanner(System.in);
        
        cadena = String.format("%s%s\n",cadena,"Listado de personas ingresadas");
        do{ 
            contador = contador + 1 ;
            
            System.out.println("Ingrese sus nombres");
            nombres = sc.nextLine();
            
            System.out.println("Ingrese sus apellidos");
            apellidos = sc.nextLine();
            
            System.out.println("Ingrese su edad");
            edad = sc.nextInt();
            
            cadena = String.format("%s\n%s\n%s\nedad %d\n", cadena, nombres, apellidos,edad);
            
            sumaEdades = sumaEdades + edad;
            
            sc.nextLine(); // Limpiar Buffer
            
            System.out.println("Desea salir ingrese 'n' ");
            valorUsuario = sc.nextLine();
            
            if(valorUsuario.equals("n")){
                bandera = false;
            }
                                    
        }while (bandera==true);
        
        promedioEdades = (double)sumaEdades/contador;
        
        cadena = String.format("%sPromedio de edaddes: %.2f\n", cadena, promedioEdades);
        
        System.out.printf("%s",cadena);
        
    }
        
 }
    
    


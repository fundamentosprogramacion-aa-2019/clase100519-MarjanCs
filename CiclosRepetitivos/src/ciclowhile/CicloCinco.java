
package ciclowhile;

import java.util.Scanner;


public class CicloCinco {
    public static void main(String[] args) {
        
        int limite = 3;
        int contador = 1;
        int suma = 0;
        double promedio = 0;
        int nota = 0;
        String mensajeFinal = "";
         
        Scanner sc = new Scanner(System.in);
        
        mensajeFinal = String.format("%s%s\n ", mensajeFinal,"Las notas ingresadas fueron");
        while (contador <= limite){
            
            System.out.printf("Ingrese la nota%d ",contador );
            nota = sc.nextInt();
            
            suma = suma + nota;
            
            mensajeFinal= String.format("%s%d\n",mensajeFinal,nota);
            
            contador = contador + 1;
        }
        
        promedio = suma /limite;
        
        mensajeFinal = String.format("%sY su promedio es %.2f\n "
                , mensajeFinal,promedio);
        System.out.printf("%s\n", mensajeFinal);
    }
}

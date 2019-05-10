
package ciclowhile;


public class CicloCuatro {
    public static void main(String[] args) {
        
        int limite = 5;
        int contador = 1;
        int suma = 0;
        String mensajeFinal = "";
        
        //System.out.printf("%s","La suma de:\n");
        mensajeFinal = String.format("%s%s\n ", mensajeFinal,"La suma de:");
        while (contador <= limite){
            
            suma = suma + contador;
            mensajeFinal= String.format("%s%d\n",mensajeFinal,contador);
            //System.out.printf("%d\n", contador);
            
            contador = contador + 1;
        }
        mensajeFinal = String.format("%sTiene un resultado de:%d\n "
                , mensajeFinal,suma);
        System.out.printf("%s\n", mensajeFinal);
    }
}

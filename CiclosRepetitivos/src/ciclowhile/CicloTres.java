
package ciclowhile;


public class CicloTres {
    public static void main(String[] args) {
        
        int limite = 5;
        int contador = 1;
        int suma = 0;
        
        System.out.printf("%s","La suma de:\n");
        
        while (contador <= limite){
            
            suma = suma + contador;
            
            System.out.printf("%d\n", contador);
            
            contador = contador + 1;
        }
        
        System.out.printf("Tiene un resultado de : %d\n", suma);
    }
}

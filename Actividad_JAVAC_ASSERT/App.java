/**
 * 1- Compila un archivo java de algún proyecto anterior desde la terminal y ejecútalo.Funciona?

    Copia el proyecto y realiza una segunda versión: prueba a pasarle argumentos desde terminal e intenta tratar esos datos. 
    Previamente, habrás previsto como reasignar los argumentos del array de strings que recibe la función principal.

    Ejemplo: String nombre = args[0]
*/
public class App {
    public static void main(String[] args) {
        
        //por parámetro que vengan un par de números para realizar una suma

        float suma = 0;
        
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = Float.parseFloat(args[3]);


        for (String arg : args) {
            //System.out.println("Imprimir argumentos: " + string);            
            try {
                float numero = Float.parseFloat(arg);
                suma += numero; // si es número, se suma
            } catch (NumberFormatException e) {
                //imprimir lo que no es numérico
                System.out.println("Imprimir argumento: " + arg);            
            }            
        }

        System.out.println("La suma FOR de los números es: " + suma);

        suma = a + b + c;
        System.out.println("La suma ARGS[X] de a, b y c es: " + suma);
    }
}
/**
 * 2- Usa la instrucción assert para crear un test unitario para el siguiente caso:

      Debes verificar que la persona puede votar en tu país. para ello, tienes un booleano sobre la ciudadanía, y la edad debe 
      ser mayor o igual a 18 años.

      Cómo realizarías la aserción?
 */
public class Eassert {
    public static void main(String[] args) {
        int edad;
        boolean voto;

        //casos de prueba
        edad = 1;
        voto = false; 

        //edad = 15;
        //voto = false;  
        
        //edad = 21;
        //voto = false;  

        //edad = 21;
        //voto = true;  
                

        // Esto lanzará una AssertionError -> saldrá el mensaje, cuando realmente la condición no se cumpla
        assert ( edad >= 18 && voto) : "No tiene derecho a voto, por ser menor de edad o no tener registro de votar."; 
        System.out.println("Si ves este mensaje, la aserción pasó.");


    }
}

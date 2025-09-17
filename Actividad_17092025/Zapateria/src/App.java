import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <b>Clase principal:</b> 
 * que contiene un ArrayList de distintos tipos de Zapatos,
 * que se pueden ir creando haciendo llamada al método {@link #introZapatos(ArrayList<Object>, Scanner)}: que este a su vez llama
 * al método: {@link #introZapato(ArrayList<Object>, Object, Scanner)}
 * 
 * Otra clase Metodos contiene esos mismos procesos, los dupliqué por pruebas: 
 * {@link Metodos}
 * 
 * @author  APR
 * @version 1.2
 */

public class App {
    /*
     * Instructions
EJERCICIO TIENDA ZAPATERIA (segunda parte, reducido)
Aplica todo lo visto en el día de hoy a tu proyecto de zapatería!


-> ArrayList<Object> para listas mixtas con todos los zapatos

-> instanceOf para saber si el zapato pertenece a un tipo u otro

-> probar while hasNext() para evitar la excepción por tipo

-> probar formateos de consola como  limpiar pantalla y esperar a que el usuario pulse enter

-> Recuerda castear el tipo cuando sea necesario!

     */

    //de esta manera podrá ser de E/S

    //definimos este tipo de ArrayList, para incluir los ArrayList de tipo Zapato        
    static ArrayList<Object> listaZapatos = new ArrayList<>();    
    static double gastoTotal= 0.0;  

    public static void main(String[] args) throws Exception {
        Scanner  tcl = new Scanner(System.in);

        //se definen 3 arrays de los distintos tipos de Zapato
        //ArrayList<Casual> casuales = new ArrayList<>();
        //ArrayList<Deporte> deportivos = new ArrayList<>();
        //ArrayList<Elegante> elegantes = new ArrayList<>();

        // limpia pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //agregar las listas de Clases (vacias) a la lista de tipo Objeto
        listaZapatos.add(new Casual());
        listaZapatos.add(new Deporte());
        listaZapatos.add(new Elegante());
        
        
        //introducir Zapatos
        introZapatos(listaZapatos, tcl);
        
        //mostrar los zapatos
        System.out.println();
        //mostrarZapatos(listaZapatos);
        //System.out.println(listaZapatos);
       
        /*
        System.out.println();


        //gestion de compra
        System.out.println("=================COMPRAR======================");
        
        String comprar = "si";
        int tipo;        
        double gastoCompra = 0.0;

        while(comprar.equalsIgnoreCase("si")){
                System.out.println("Que tipo de zapatos quiere comprar?\n1-ELEGANTES\n2-CASUAL\n3-DEPORTIVOS");
                tipo = tcl.nextInt();
                tcl.nextLine();

                System.out.println();

                switch (tipo) {
                    case 1:
                        mostrarZapatosElegantes(elegantes);
                        System.out.println();
                        gastoCompra = (Double) comprarZapatoElegante(elegantes, tcl);
                        break;
                    case 2:                        
                        mostrarZapatosCasuales(casuales); 
                        System.out.println();
                        gastoCompra = (Double) comprarZapatoCasual(casuales, tcl);  
                        break;                
                    case 3:
                        mostrarZapatosDeportivos(deportivos);
                        System.out.println();
                        gastoCompra = (Double) comprarZapatoDeportivo(deportivos, tcl);                       
                        break;                                        
                    default:
                        System.out.println("Opción de compra incorrecta!");
                }


                System.out.println("gasto compra: " +gastoCompra);
                gastoTotal = gastoTotal + gastoCompra; 

                System.out.println();
                System.out.println("Lleva un gasto de: " + gastoTotal);
                System.out.println();
                System.out.println("Quiere seguir comprando?\nsi\nsalir");
                comprar = tcl.nextLine();
                System.out.println();

        }

        if ( gastoTotal > 0){
            System.out.println("Ha realizado una compra de: " + gastoTotal + " euros.");
        }

        System.out.println("Hasta la próxima!");

        **/

        tcl.close();

    }

    
    //mostrar Zapatos
    /**
     * Mostrar la lista de zapatos de cualquier tipo
     *
     * @param lista ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     */
    public static void mostrarZapatos(ArrayList<Object> lista){
        //crear copia de la lista Original, para evitar el error de java.util.ConcurrentModificationException
        //mientras se estén aplicandos cambios en la iteracción
        ArrayList<Object> listaCopia = new ArrayList<>(lista);        
        
        for (Object zapato : listaCopia) {
            /* 
            if (zapato instanceof Elegante) {
                System.out.println("*Lista de Zapatos Elegantes:");                
                System.out.println(((Elegante) zapato).toString());
                System.out.println();
            } else*/ if (zapato instanceof Casual) {
                System.out.println("*Lista de Zapatos Casuales:");                            
                System.out.println("bien: " +((Casual) zapato).toString());
                System.out.println();
            }/* else if (zapato instanceof Deporte) {
                System.out.println("*Lista de Zapatos Deportivos:");                            
                System.out.println(((Deporte) zapato).toString());
                System.out.println();
            }
                */

            lista = listaCopia;
        }
    }
    
    //método para introducir los zapatos de cada tipo....

    /**
     * Método para introducir un objeto zapato en la lista de los distintos zapatos, por teclado se introducirán los datos
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param zapato objeto de tipo Zapato: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     */
    public static void introZapato(ArrayList<Object> lista, Object zapato, Scanner tcl){
        //crear copia de la lista Original, para evitar el error de java.util.ConcurrentModificationException
        //mientras se estén aplicandos cambios en la iteracción
        ArrayList<Object> listaCopia = new ArrayList<>(lista);

        String marca;
        String modelo;
        String talla;
        double precio = 0.0;

        //común a los distintos Arrays
        System.out.println("Marca:");
        marca = tcl.nextLine();

        System.out.println("Modelo:");
        modelo = tcl.nextLine();

        System.out.println("Talla:");
        talla = tcl.nextLine();

        System.out.println("Precio:");
        precio = tcl.nextDouble();
        tcl.nextLine();

        if (zapato instanceof Casual) {
            Casual zc = new Casual(marca,modelo,talla,precio); 

            zapato = zc;

            System.out.println( zapato.toString() );

            listaCopia.add(zc);
        }
        lista = listaCopia;   
        
        //imprime bien los valores de AMBAS maneras
        //System.out.println("listaCopia");
        //mostrarZapatos(listaCopia);
        //System.out.println();

        System.out.println("lista");
        mostrarZapatos(lista);
        System.out.println();

        //System.out.println(lista);
    }

    /**
     * Método principal para comenzar a introducir zapatos
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     */    
    public static void introZapatos(ArrayList<Object> lista, Scanner tcl){ 
        //crear copia de la lista Original, para evitar el error de java.util.ConcurrentModificationException
        //mientras se estén aplicandos cambios en la iteracción
        ArrayList<Object> listaCopia = new ArrayList<>(lista);

        int c = 0;

        for (Object zapato : listaCopia) {   
            if (zapato instanceof Casual) {
                while (c<1) {                
                    //System.out.println("Lista de Zapatos Casuales:");                            
                    //System.out.println(((Casual) zapato));
                    //System.out.println();

                    Casual zc = new Casual(); 
                    //zc = (Casual) zapato;

                    System.out.println("===Zapato Casual===");     
                    introZapato(listaCopia, zc, tcl); 

                    listaCopia.add(zc);   

                                   
                    //System.out.println( zapato.toString() );                   

                    c +=1;
                }                    
            }

        } 
        
        //mostrarZapatos(lista);
        //System.out.println(lista);
        System.out.println("lista  fuera");
        mostrarZapatos(listaCopia);
        System.out.println();
    
    }

    /**
     * Método que solicita datos de un zapato Casual y lo agrega a la lista general de zapatos
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     */ 
    public static void introZapatoCasual(ArrayList<Casual> lista, Scanner tcl){
        System.out.println("===Zapato Casual===");
        System.out.println("Marca:");
        String marca = tcl.nextLine();

        System.out.println("Modelo:");
        String modelo = tcl.nextLine();

        System.out.println("Talla:");
        String talla = tcl.nextLine();

        System.out.println("Precio:");
        double precio = tcl.nextDouble();
        tcl.nextLine();

        Casual zaCasual = new Casual(marca, modelo, talla, precio);
        lista.add(zaCasual);
    }

    /**
     * Método que solicita datos de un zapato Deporte y lo agrega a la lista general de zapatos
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     */     
    public static void introZapatoDeporte(ArrayList<Deporte> lista, Scanner tcl){
        System.out.println("===Zapato Deporte===");
        System.out.println("Marca:");
        String marca = tcl.nextLine();

        System.out.println("Modelo:");
        String modelo = tcl.nextLine();

        System.out.println("Talla:");
        String talla = tcl.nextLine();

        System.out.println("Precio:");
        double precio = tcl.nextDouble();
        tcl.nextLine();

        Deporte zaDeporte = new Deporte(marca, modelo, talla, precio);
        lista.add(zaDeporte);
    }

    /**
     * Método que solicita datos de un zapato Elegante y lo agrega a la lista general de zapatos
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     */       
    public static void introZapatoElegante(ArrayList<Elegante> lista, Scanner tcl){
        System.out.println("===Zapato Elegante===");
        System.out.println("Marca:");
        String marca = tcl.nextLine();

        System.out.println("Modelo:");
        String modelo = tcl.nextLine();

        System.out.println("Talla:");
        String talla = tcl.nextLine();

        System.out.println("Precio:");
        double precio = tcl.nextDouble();
        tcl.nextLine();

        Elegante zElegante = new Elegante(marca, modelo, talla, precio);
        lista.add(zElegante);
    }    


    //COMPRA DE TIPOS DE ZAPATOS

    /**
     * Compra de Zapato Casual
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     * @return El precio del zapato.
     */     
    public static Double comprarZapatoCasual(ArrayList<Casual> lista, Scanner tcl){
        System.out.println("Que modelo quiere comprar?\n");
        String modelo = tcl.nextLine();
       
        Iterator<Casual> it = lista.iterator();
        
        // Loop through a collection
        while(it.hasNext()) {
            Casual zCasual = it.next();
            if(zCasual.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("El precio del modelo es de " + zCasual.getPrecio());
                return (Double) zCasual.getPrecio();
            }            
        }  

        return 0.0;
      
    }    

    /**
     * Compra de Zapato Deportivo
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     * @return El precio del zapato.
     */
    public static Double comprarZapatoDeportivo(ArrayList<Deporte> lista, Scanner tcl){
        System.out.println("Que modelo quiere comprar?\n");
        String modelo = tcl.nextLine();
       
        Iterator<Deporte> it = lista.iterator();
        
        // Loop through a collection
        while(it.hasNext()) {
            Deporte zDeporte = it.next();
            if(zDeporte.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("El precio del modelo es de " + zDeporte.getPrecio());
                return (Double) zDeporte.getPrecio();
            }            
        }
        
        return 0.0;
      
    }    

    /**
     * Compra de Zapato Elegante
     *
     * @param lista  ArrayList que contiene los objetos de tipos Zapatos: Casual, Deporte o Elegante
     * @param tcl    para poder solicitar datos a través de teclado
     * @return El precio del zapato.
     */    
    public static Double comprarZapatoElegante(ArrayList<Elegante> lista, Scanner tcl){
        System.out.println("Que modelo quiere comprar?\n");
        String modelo = tcl.nextLine();
       
        Iterator<Elegante> it = lista.iterator();
        
        // Loop through a collection
        while(it.hasNext()) {
            Elegante zElegante = it.next();
            if(zElegante.getModelo().equalsIgnoreCase(modelo)){
                System.out.println("El precio del modelo es de " + zElegante.getPrecio());
                return (Double) zElegante.getPrecio();
            }            
        }

        return 0.0;    
      
    }
    
}

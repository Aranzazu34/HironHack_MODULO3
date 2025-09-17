import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * <b>Clase Metodos:</b>
 * que contiene los métodos comunes a utilizar en App.java
* @author APR
* 
*/

public class Metodos {

    //metodos para introducir los zapatos de cada tipo.... SE PUEDE REDUCIR??? con ArrayList<Object> lista???

    /**
     * Método que solicita datos de un zapato Casual y lo agrega a la lista general de zapatos (METODOS)
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
     * Método que solicita datos de un zapato Deporte y lo agrega a la lista general de zapatos (METODOS)
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
     * Método que solicita datos de un zapato Elegante y lo agrega a la lista general de zapatos (METODOS)
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

    //mostrar lista de zapatos tipo  COMO REDUCIR???

    /**
     * Mostrar zapatos Casual (Metodos)
     *
     * @param lista  ArrayList de tipo Zapato Casual
     */     
    public static void mostrarZapatosCasuales(ArrayList<Casual> lista){
        System.out.println("Lista de Zapatos Casuales:");
        System.out.println();
        for (Casual elemento : lista) {
            System.out.println(elemento);
        }
    }

    /**
     * Mostrar zapatos Deportivos (Metodos)
     *
     * @param lista  ArrayList de tipo Zapato Deporte
     */     
    public static void mostrarZapatosDeportivos(ArrayList<Deporte> lista){
        System.out.println("Lista de Zapatos Deportivos:");
        System.out.println();
        for (Deporte elemento : lista) {
            System.out.println(elemento);
        }
    }    

    /**
     * Mostrar zapatos Elegantes (Metodos)
     *
     * @param lista  ArrayList de tipo Zapato Elegante
     */  
    public static void mostrarZapatosElegantes(ArrayList<Elegante> lista){
        System.out.println("Lista de Zapatos Elegantes:");
        System.out.println();
        for (Elegante elemento : lista) {
            System.out.println(elemento);
        }
    }    
    
    //COMPRA DE TIPOS DE ZAPATOS

    /**
     * Compra de Zapato Casual (Metodos)
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
     * Compra de Zapato Deportivo (Metodos)
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
     * Compra de Zapato Elegante (Metodos)
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
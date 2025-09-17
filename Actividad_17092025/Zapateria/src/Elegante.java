/**
 * <b>Clase Elegante:</b>
 * que define los zapatos elegantes
* @author APR
* 
*/
public class Elegante {
    private String  marca;
    private String  modelo;
    private String  talla;
    private Double  precio;


    /**
     * Constructor vacío Elegante    
     */
    public Elegante() {
    }

    /**
     * Constructor para la clase Elegante con parámetros.
     *
     * @param marca marca del zapato.
     * @param modelo modelo zapato.
     * @param talla numero de pie.
     * @param precio precio del zapato. 
     */
    public Elegante(String marca, String modelo, String talla, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }


    //GETTERS AND SETTERS

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }



    //TOSTRING

    /**
     * Implementación específica para devolver información del zapato Elegante.
     * Este método sobrescribe el método toString().
     *
     * @return Una cadena de texto con los datos del zapato Elegante.
     */    
    @Override
    public String toString() {
        return "El zapato es de la marca " + getMarca() + ", modelo " + getModelo() + " de la talla " + getTalla() + 
               ". Tiene un precio de " + getPrecio() + ".";
    }    
}

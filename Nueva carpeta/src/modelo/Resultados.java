package modelo;

/**
 * Clase que almacena dos números como cadenas de texto.
 */
public class Resultados {
    private String numero1;
    private String numero2;

    // Constructor sin parámetros
    public Resultados() {}

    // Constructor con parámetros
    public Resultados(String numero1, String numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getters y Setters
    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }
    
    // Método que se puede sobrescribir en subclases
    protected void agregar() {}
}
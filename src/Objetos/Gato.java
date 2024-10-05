package Objetos;

public class Gato {

    // Definir atributos
    private String nombre;
    private Double peso;
    private Integer edad;
    private String raza;

    // Crear constructor 
    public Gato() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // Definir metodos
    public String eat(String food) {
        return "Aqui comiendo " + food + " Ñumi Ñumi ";
    }

    public void meaw() {
        System.out.println("meooow");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato");
        sb.append("nombre  = ").append(nombre);
        sb.append(", peso  = ").append(peso);
        sb.append(", edad  = ").append(edad);
        sb.append(", raza  = ").append(raza);
        sb.append('}');
        return sb.toString();
    }

    
}

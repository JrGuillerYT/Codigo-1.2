package Objetos;

public class Perro {

    // Definir atributos
    private String nombre;

    // Crear constructor
    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Definir metodos
    public String eat(String food) {
        return "Aqui comiendo " + food + " Ñamñan Ñamñan ";
    }

    public void meaw() {
        System.out.println("meooow");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro");
        sb.append(" nombre  = ").append(nombre);
        sb.append('}');
        return sb.toString();
    }

}

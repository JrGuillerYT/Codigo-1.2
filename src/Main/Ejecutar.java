package Main;

import Objetos.Gato;
import Objetos.Perro;


public class Ejecutar {
    
    public static void main(String[] args){
        
        Perro perro_1 = new Perro();
        perro_1.setNombre("firulais");
        System.out.println(perro_1.toString());
        System.out.println("Guaaaaa");
        System.out.println("::::::::::::::::::::::::::::::");
        
        Gato gato_1 = new Gato();
        gato_1.setNombre("Michimba");
        gato_1.setEdad(3);
        gato_1.setPeso(10.2);
        gato_1.setRaza("volador");
        
        System.out.println(gato_1.toString());
        System.out.println(gato_1.eat("chorizo"));
        gato_1.meaw();
        System.out.println("::::::::::::::::::::::::::::::");
        Gato gato_2 = new Gato();
        gato_2.setNombre("kyle");
        System.out.println(gato_2.getNombre());
        
    }
}

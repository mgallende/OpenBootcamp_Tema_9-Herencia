public class Main {

    public static void main(String[] args) {

        //creamos el objeto persona en el main
        Persona persona = new Persona();

        //Asignamos valores a las propiedades con Set
        persona.setNombre("Manuel Gómez");
        persona.setEdad(62);
        persona.setTelefono(683608805);

        //imprimimos por consola
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());

    }
}


// Creamos la clase Persona

class Persona {
    private String nombre;
    private int    edad;
    private int    telefono;

    // Get y Set de la propiedad Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Get y Set de la propiedad Edad
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Get y Set de la propiedad Teléfono
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
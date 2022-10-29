public
class Main {

    public static
    void main(String[] args) {

        //creamos los objetos cliente y trabajador en el main
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //imprimimos por consola
        System.out.println("Cliente: " + cliente.nombre + "Edad: " + cliente.edad
                + "Teléfono: " + cliente.telefono + "Crédito: " + cliente.credito);

        System.out.println("\r\n");

        System.out.println("Trabajador: " + trabajador.nombre + "Edad: " + trabajador.edad
                + "Teléfono: " + trabajador.telefono + "salario: " + trabajador.salario);
    }
}


// Creamos la clase Persona

class Persona {
    String nombre   = "Manuel Gómez Allende";
    int    edad     = 62;
    int    telefono = 683608805;
}

class Cliente extends Persona {
    int credito = 2500;
}

class Trabajador extends Persona {
    int salario = 32000;
}
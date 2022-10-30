public class Main {

    public static void main(String[] args) {

        //creamos los objetos Cliente y trabajador en el main

        Cliente cliente = new Cliente();

        Trabajador trabajador = new Trabajador();

        //Asignamos valores a las propiedades de la clase Cliente
        cliente.nombre = "Manuel Gómez";
        cliente.edad = 62;
        cliente.telefono = 683608805;
        cliente.credito = 50150;

        //Asignamos valores a las propiedades de la Clase Trabajador
        trabajador.nombre = "Jorge López";
        trabajador.edad = 45;
        trabajador.telefono = 606606606;
        trabajador.salario = 350150;

        //imprimimos por consola
        System.out.println("Cliente: " + cliente.nombre + " |  Edad: " + cliente.edad
                + " | Teléfono: " + cliente.telefono + " | Crédito: " + cliente.credito);

        System.out.println("\r\n");

        System.out.println("Trabajador: " + trabajador.nombre + " |  Edad: " + trabajador.edad
                + " |  Teléfono: " + trabajador.telefono + " |  Salario: " + trabajador.salario);
    }
}


// Creamos la clase Persona

class Persona {
    String nombre;
    int    edad ;
    int    telefono;
}

// Creamos la clase Cliente que hereda de Persona con extends y añadimos la propiedad crédito

class Cliente extends Persona {
    int credito;
}

// Creamos la clase Trabajador que hereda de Persona con extends y añadimos la propiedad salario
class Trabajador extends Persona {
    int salario;
}
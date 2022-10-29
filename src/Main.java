public
class Main {

    public static
    void main(String[] args) {

        //creamos los objetos Cliente y trabajador en el main

        Cliente cliente = new Cliente();

        Trabajador trabajador = new Trabajador();

        //Asignamos valores a las variables de ambas clases
        cliente.setNombre("Manuel Gómez");
        cliente.setEdad(62);
        cliente.setTelefono(683608805);
        cliente.setCredito(5000);
        trabajador.setNombre("Manuel Gómez");
        trabajador.setEdad(62);
        trabajador.setTelefono(683608805);
        trabajador.setSalario(35000);

        //imprimimos por consola
        System.out.println("Cliente: " + cliente.getNombre() + " |  Edad: " + cliente.getEdad()
                + " | Teléfono: " + cliente.getTelefono() + " | Crédito: " + cliente.getCredito());

        System.out.println("\r\n");

        System.out.println("Trabajador: " + trabajador.getNombre() + " |  Edad: " + trabajador.getEdad()
                + " |  Teléfono: " + trabajador.getTelefono() + " |  Salario: " + trabajador.getSalario());
    }
}


// Creamos la clase Persona

class Persona {
    private String nombre;
    private int    edad ;
    private int    telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

// Creamos la clase Cliente que hereda de Persona con extends y añadimos la propiedad crédito

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

}

// Creamos la clase Trabajador que hereda de Persona con extends y añadimos la propiedad salario
class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
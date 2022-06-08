public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Martin");
        cliente.setNumero(379461283);
        cliente.setCredito(40000);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getNumero());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(25);
        trabajador.setNombre("Carlos");
        trabajador.setNumero(37958668);
        trabajador.setSalario(35000);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getNumero());
        System.out.println(trabajador.getSalario());


    }
}

class Persona {
    int edad;
    String nombre;
    int numero;

}

class Cliente extends Persona {
    int credito;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setCredito (int credito) {
        this.credito = credito;
    }

    public int getCredito(){
        return this.credito;
    }
}


class Trabajador extends Persona {
    int salario;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setSalario (int salario) {
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}
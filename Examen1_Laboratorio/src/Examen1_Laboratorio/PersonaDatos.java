package Examen1_Laboratorio;

public class PersonaDatos {
    private String Nombre;
    private int Edad;
    private int ID;
    private int IDBoleto;
    private String Departamento;
    private int Dinero;
    private String Ocupacion;

    public PersonaDatos() {
    }

    public PersonaDatos(String Nombre, int Edad, int ID, int IDBoleto, String Departamento, int Dinero, String Ocupacion) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.ID = ID;
        this.IDBoleto = IDBoleto;
        this.Departamento = Departamento;
        this.Dinero = Dinero;
        this.Ocupacion = Ocupacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDBoleto() {
        return IDBoleto;
    }

    public void setIDBoleto(int IDBoleto) {
        this.IDBoleto = IDBoleto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    /*public String toString1() {
        return "Persona Datos: " + "Nombre: " + Nombre + ", Edad: " + Edad + ", ID: " + ID + ", IDBoleto: " + IDBoleto + ", Departamento: " + Departamento + ", Dinero: " + Dinero + ", Ocupacion: " + Ocupacion + "\n";
    }*/
    
    @Override
    public String toString() {
        return Nombre;
    }
    
} // Fin class PersonaDatos
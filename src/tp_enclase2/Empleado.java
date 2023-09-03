package tp_enclase2;

public class Empleado {
    
    int dni;
    String apellido;
    String nombre;
    String categoria;
    double sueldo;
    Empresa empresa;

    public Empleado(int dni, String apellido, String nombre, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }
      

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
        
}
